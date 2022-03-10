package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int zadanie;

        while(true) {

            System.out.print("\n\n\n");
            System.out.print("+----------------------------------+\n");
            System.out.print("|1.Ułamek                          |\n");
            System.out.print("|2.Celsjusz na Fahrenheit          |\n");
            System.out.print("|3.Mile na Kilometry (tabela)      |\n");
            System.out.print("|4.Dzień tygodnia                  |\n");
            System.out.print("|5.Tablica                         |\n");
            System.out.print("|6.Ciąg                            |\n");
            System.out.print("|7.NWD                             |\n");
            System.out.print("+----------------------------------+\n\n");
            System.out.print("Twój wybór: ");
            zadanie = scan.nextInt();

            if(zadanie>0 && zadanie<8){
                break;
            }

        }

        if(zadanie==1) {
            System.out.println((9.5 * 4.5 - 2.5 * 3) / (45.5 - 3.5));
        }
        else if(zadanie==2) {
            float celsjusze = scan.nextInt();

            float fahrenheit = (float) ((9/5.0)*celsjusze+32);
            System.out.println(fahrenheit);
        }
        else if(zadanie==3) {
            for(int i=1;i<=10;i++){
                System.out.println(i + ". " + i*1.609);
            }
        }
        else if(zadanie==4) {
            int liczba;

            while(true) {
                liczba = scan.nextInt();
                if (liczba > 0 && liczba < 8) {
                    break;
                }
            }
            switch(liczba){
                case 1:
                    System.out.println("Poniedziałek");
                    break;
                case 2:
                    System.out.println("Wtorek");
                    break;
                case 3:
                    System.out.println("Środa");
                    break;
                case 4:
                    System.out.println("Czwartek");
                    break;
                case 5:
                    System.out.println("Piątek");
                    break;
                case 6:
                    System.out.println("Sobota");
                    break;
                case 7:
                    System.out.println("Niedziela");
                    break;
                }
        }
        else if(zadanie==5) {
            System.out.print("Proszę podać wielkość tablicy: ");
            int wielkosc = scan.nextInt();
            char znak[] = new char[wielkosc];

            for(int i=0; i<wielkosc; i++){
                znak[i] = scan.next().charAt(0);
            }

            for (char x : znak) {
                System.out.print(x);
            }
        }
        else if(zadanie==6) {
            System.out.print("Proszę podać wielkość tablicy: ");
            int wielkosc = scan.nextInt();

            int tablica[] = new int[wielkosc];

            System.out.print("Proszę podać pierwszy element tablicy: ");
            tablica[0] = scan.nextInt();

            if (tablica[0] % 2 == 1) {
                tablica[1] = tablica[0] + 1;
            } else {
                tablica[1] = tablica[0] + 2;
            }

            for (int i = 2; i < wielkosc; i++) {
                tablica[i] = tablica[i - 1] + 2;
            }

            for (int x : tablica
            ) {
                System.out.print(x + ", ");
            }

            int wybor;

            while (true) {

                System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                System.out.print("+----------------------------------+\n");
                System.out.print("|1.Najmniejsza wartość             |\n");
                System.out.print("|2.Największa wartość              |\n");
                System.out.print("|3.Suma elementów                  |\n");
                System.out.print("|4.Średnia elementów               |\n");
                System.out.print("|5.Mediana elementów               |\n");
                System.out.print("+----------------------------------+\n\n");
                System.out.print("Twój wybór: ");
                wybor = scan.nextInt();

                if (wybor > 0 && wybor < 6) {
                    break;
                }

            }

            if (wybor == 1) {
                System.out.print("Najmniejsza wartość: " + tablica[0]);
            } else if (wybor == 2) {
                System.out.print("Największa wartość: " + tablica[wielkosc - 1]);
            } else if (wybor == 3) {
                int sumaX = 0;
                System.out.print("Suma elementów: ");
                for (int x : tablica) {
                    sumaX += x;
                }
                System.out.print(sumaX);
            } else if (wybor == 4) {
                double sumaX = 0;
                System.out.print("Średnia elementów: ");
                for (double x : tablica) {
                    sumaX += x;
                }
                double srednia = sumaX / wielkosc;
                System.out.print(srednia);
            } else if (wybor == 5) {
                if (wielkosc % 2 == 1) {
                    System.out.print("Średnia elementów: " + tablica[wielkosc / 2]);
                } else {
                    int twa = (int) Math.ceil((wielkosc - 1) / 2);
                    int two = (int) Math.floor(wielkosc / 2);
                    int wynik = (tablica[twa] + tablica[two]) / 2;
                    System.out.print("Średnia elementów: " + wynik);
                }
            }
        }
        else if(zadanie==7) {

            System.out.print("Pierwsza liczba:");
            int a = scan.nextInt();
            System.out.print("Druga liczba:");
            int b = scan.nextInt();

            int wynik = NWD(a,b);
            System.out.print("Największy wspólny dzielnik wynosi: " + wynik);

        }
    }

    static int NWD(int a, int b){

        int wynik=1;

        if(a==b){
            wynik=a;
        } else if(a>b){
            for(int i=b; i>1;i--){
                if(a%i==0 && b%i==0){
                    wynik=i;
                    break;
                }
            }
        } else if(b>a){
            for(int i=a; i>1;i--){
                if(a%i==0 && b%i==0){
                    wynik=i;
                    break;
                }
            }
        }

        return wynik;
    }
}
