package com.company;

public class Kwadrat {
    int bok;

    public Kwadrat(int bok) {
        this.bok = bok;
    }

    public int Obwod(){
        return 4*bok;
    }

    public int Pole(){
        return bok*bok;
    }

}
