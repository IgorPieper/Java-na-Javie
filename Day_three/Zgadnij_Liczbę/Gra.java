package com.company;

import java.util.Random;
import java.util.Scanner;

public class Gra {

Scanner Scan = new Scanner(System.in);

private int pocz;
private int kon;
private int proba=0;
private int wynik;

    Random rand = new Random();

    public Gra(int pocz, int kon) {
        this.pocz = pocz;
        this.kon = kon;
        this.wynik = rand.nextInt(pocz+1, kon+1);
    }

    public void zgadnij(){
        for(int i=0;i<=5;i++) {

            System.out.print("Strzał: ");
            int strzal=Scan.nextInt();

            if (strzal > wynik) {
                System.out.println("Mniej");
                proba++;
            } else if (strzal < wynik) {
                System.out.println("Więcej");
            } else if (strzal == wynik) {
                System.out.println("Zgadłeś!!!");
                break;
            }
        }
        if(proba>5){
            System.out.println(wynik);
        }
    }

    public int getWynik() {
        return wynik;
    }
}
