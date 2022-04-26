package com.company;

public class Main {

    public static void main(String[] args) {

        try{
            int a = 5/0;
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Koniec");
        }

    }
}
