package pl.edu.pjwstk;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType0Font;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException {
        PDDocument doc = new PDDocument();
        for(int n = 1; n < 11; ++n){
            PDPage page = new PDPage();

            doc.addPage(page);
            PDPageContentStream stream = new PDPageContentStream(doc, page);

            stream.beginText();
            stream.setFont(PDType1Font.COURIER, 14);
            stream.newLineAtOffset(580, 10);
            stream.showText(String.valueOf(n));

            if (n==1){
                stream.newLineAtOffset(-100, 600);
                stream.showText("Hello World!!");
            } else if (n==10){
                stream.newLineAtOffset(-100, 100);
                stream.showText("Goodbye");
            }

            stream.endText();
            stream.close();
        }


        doc.save("kapibara.pdf");
        doc.close();
    }
}
