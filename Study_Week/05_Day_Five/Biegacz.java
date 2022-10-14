package com.company;

public class Main {

    public static void main(String[] args) {

        try{
            biegacz();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        } //finally {}
    }

    static void biegacz() throws RuntimeException{
        throw new RuntimeException();
    }

}
