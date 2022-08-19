package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner Scan = new Scanner(System.in);

        System.out.print("Najmniejsza liczba: ");
        int licz=Scan.nextInt();

        System.out.print("Największa liczba: ");
        int kon=Scan.nextInt();

        Gra g1 = new Gra(licz, kon);

        int strzal;

        g1.zgadnij();

    }
}
