package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Konto u1 = new Konto(1,100);
        Konto u2 = new Konto(2,100);
        Konto u3 = new Konto(3,100);
        Konto u4 = new Konto(4,100);
        Konto u5 = new Konto(5,100);

        int konto;

        while(true) {

            System.out.print("Enter an id: ");
            konto = scan.nextInt();

            if(konto>0 && konto<6){
                break;
            } else{
                System.out.println("User is not existing.");
            }

        }

        while(true){
            System.out.println("\nMain Menu");
            System.out.println("1: check balance");
            System.out.println("2: withdraw");
            System.out.println("3: deposit");
            System.out.println("4: exit");
            System.out.print("Enter a choice: ");

            int wybor = scan.nextInt();

            if(wybor==1) {
                System.out.print("Your balance: ");
                System.out.print(u1.balance());
            }
            else if(wybor==2) {
                System.out.print("Ile chcesz wypłacić: ");
                double mniej = scan.nextDouble();
                u1.withdraw(mniej);
            }
            else if(wybor==3){
                System.out.print("Ile chcesz wpłacić: ");
                double wiecej = scan.nextDouble();
                u1.withdraw(wiecej);
            }
            else if(wybor==4){
                break;
            }

            System.out.print("\n\n");

        }



    }
}
