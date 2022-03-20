package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int zadanie;

        while(true) {

            System.out.print("\n\n\n");
            System.out.print("+----------------------------------+\n");
            System.out.print("|1.Łączenie tablic                 |\n");
            System.out.print("|2.Kwadrat                         |\n");
            System.out.print("|3.Punkt                           |\n");
            System.out.print("|4.Koło                            |\n");
            System.out.print("|5.Wiatrak                         |\n");
            System.out.print("+----------------------------------+\n\n");
            System.out.print("Twój wybór: ");
            zadanie = scan.nextInt();

            if(zadanie>0 && zadanie<6){
                break;
            }
        }

        if(zadanie==1) {

            int[] tablica1 = new int[] {1, 2, 3};
            int[] tablica2 = new int[] {4, 5, 6};
            int[] suma = tablice(tablica1, tablica2);
            System.out.println(Arrays.toString(suma));
        }
        else if(zadanie==2){
            Kwadrat kw1 = new Kwadrat(2);
            System.out.println("Obwód: " + kw1.Obwod());
            System.out.println("Pole: " + kw1.Pole());
        }
        else if(zadanie==3) {
            Punkt pkt1 = new Punkt(1,3);
            Punkt pkt2 = new Punkt();
            System.out.println("Odległość od punktu: " + pkt1.Odleglosc(4, 10));
            System.out.println("Odległość od środka układu: " + pkt1.Odleglosc(pkt2));
        }
        else if(zadanie==4){
            MyCircle kolo = new MyCircle(3);
            System.out.println("Obwód Koła: " + kolo.Obwod(kolo.radius));
            System.out.println("Pole Koła: " + kolo.Pole(kolo.radius));
            System.out.println("Średnica Koła: " + kolo.Srednica(kolo.radius));
        }
        else if(zadanie==5){
            Wiatrak w1 = new Wiatrak(100, true, 15, "mint");
            w1.informacje(w1.speed, w1.on, w1.radius, w1.color);
        }
    }

    public static int[] tablice(int[] tablica1, int[] tablica2){

        if (tablica1.length!=tablica2.length){
            return new int[]{};
        }

        int[] suma = new int[tablica1.length];

        for (int i=0; i<tablica1.length;++i){
            suma[i] = tablica1[i]+tablica2[i];
        }

        return suma;
    }

}
