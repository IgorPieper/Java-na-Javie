package pl.pjatk;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringUtilsTest {
    @Test
    public void isTextAlaMaKotaUpperCased(){
        String expected = "ALA MA KOTA";
        String result = StringUtils.toUpperCase("Ala ma kota");
        assertEquals(expected, result);
    }

    @Test
    public void isTextMonkeyUpperCased(){
        String expected = "@";
        String result = StringUtils.toUpperCase("@");
        assertEquals(expected, result);
    }

    @Test
    public void isTextMonkeyReversed(){
        String expected = "yeknoM";
        String result = StringUtils.reverseString("Monkey");
        assertEquals(expected, result);
    }

    @Test
    public void isTextLubieProgramowacReversed(){
        String expected = "ćawomargorp eibul";
        String result = StringUtils.reverseString("lubie programować");
        assertEquals(expected, result);
    }

    @Test
    public void SayTestThreeTimes(){
        String expected = "test test test";
        String result = StringUtils.multiplyString("test", 3);
        assertEquals(expected, result);
    }

    @Test
    public void SayLupaFiveTimes(){
        String expected = "Lupa Lupa Lupa Lupa Lupa";
        String result = StringUtils.multiplyString("Lupa", 5);
        assertEquals(expected, result);
    }

    @Test
    public void DeleteSmallLettersFromJanKowalski(){
        String expected = "J K";
        String result = StringUtils.removeSmallChars("Jan Kowalski");
        assertEquals(expected, result);
    }

    @Test
    public void DeleteSmallLettersFromDumblledor(){
        String expected = "DUMB";
        String result = StringUtils.removeSmallChars("DUMBlledor");
        assertEquals(expected, result);
    }

    @Test
    public void DeleteBigLettersFromJanKowalsk(){
        String expected = "an owalski";
        String result = StringUtils.removeBigChars("Jan Kowalski");
        assertEquals(expected, result);
    }

    @Test
    public void DeleteBigLettersFromStokrotka(){
        String expected = "sto";
        String result = StringUtils.removeBigChars("stoKROTKA");
        assertEquals(expected, result);
    }

    @Test
    public void DeleteNumbersFromTest(){
        String expected = "Test";
        String result = StringUtils.removeAllButLetters("123Test!");
        assertEquals(expected, result);
    }

    @Test
    public void DeleteNumbersFromHighfive(){
        String expected = "High";
        String result = StringUtils.removeAllButLetters("High5!!!");
        assertEquals(expected, result);
    }
}
