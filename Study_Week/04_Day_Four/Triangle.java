package com.company;

public class Triangle extends Shape{

    int bokA;
    int bokB;
    int bokC;
    int wysokosc;

    public Triangle(int bokA, int bokB, int bokC, int wysokosc) {
        this.bokA = bokA;
        this.bokB = bokB;
        this.bokC = bokC;
        this.wysokosc = wysokosc;
    }

    @Override
    public double getArea() {
        return 0.5*bokA*wysokosc;
    }

    @Override
    public double getPerimeter() {
        return bokA+bokB+bokC;
    }
}
