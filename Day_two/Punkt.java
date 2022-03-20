package com.company;

public class Punkt {
    float x;
    float y;

    public Punkt() {
        this.x=0;
        this.y=0;
    }

    public Punkt(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float Odleglosc(Punkt punkcik){
        return Odleglosc(punkcik.x, punkcik.y);
    }

    public float Odleglosc(float x, float y){
        float a = Math.abs(this.x-x);
        float b = Math.abs(this.y-y);

        return (float) Math.sqrt(a*a+b*b);
    }
}
