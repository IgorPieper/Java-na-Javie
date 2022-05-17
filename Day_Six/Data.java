package com.company;


import java.time.DateTimeException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String formatti = scan.next();

        LocalDateTime dzisiaj = LocalDateTime.now();
        try {
            DateTimeFormatter format = DateTimeFormatter.ofPattern(formatti);
            String sformatowanaData = dzisiaj.format(format);
            System.out.println(sformatowanaData);
        } catch (IllegalArgumentException o){
            System.out.println("Dupa nie format, łap defaultowy");
            DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-YYYY  HH:mm:ss");
            String sformatowanaData = dzisiaj.format(format);
            System.out.println(sformatowanaData);
        }
    }
}
