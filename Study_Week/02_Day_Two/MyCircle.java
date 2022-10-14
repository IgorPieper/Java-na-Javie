package com.company;

public class MyCircle {
    int radius;

    public MyCircle(int radius) {
        this.radius = radius;
    }

    public int Pole(int radius){
        return (int) Math.PI*radius*radius;
    }

    public int Obwod(int radius){
        return (int) (2*Math.PI*radius);
    }

    public int Srednica(int radius){
        return 2*radius;
    }
}
