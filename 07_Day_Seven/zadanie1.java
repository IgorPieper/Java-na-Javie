package com.company;

public class Main {

    public static void main(String[] args) {

        int liczba1 = 1;
        int liczba2 = 2;

        compare(liczba1, liczba2);

    }

    public static int compare(int liczba1, int liczba2){

        if (liczba1<liczba2){
            return 1;
        } else if (liczba1==liczba2){
            return 0;
        } else if (liczba1>liczba2){
            return -1;
        }
    }

}
