package com.company;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Lab11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<Integer> liczby = new HashSet<>(); //Set automatycznie zbiera unikalne liczby
        while (liczby.size()<10) {
            liczby.add(pobierzLiczbe(scanner));
        }
        int suma = 0;
        for(Integer liczba:liczby) {
            suma+=liczba;
        }
        System.out.println(liczby);
        System.out.println("Suma = " + suma);
    }

    public static int pobierzLiczbe(Scanner scanner) {
        System.out.println("Podaj liczbe: ");
        String text = scanner.nextLine();
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Podano niewlasciwa liczbe!");
            return pobierzLiczbe(scanner);
        }
    }

}
