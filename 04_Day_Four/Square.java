package com.company;

public class Square extends Shape{

    int bok;

    public Square(int bok) {
        this.bok = bok;
    }

    @Override
    public double getArea() {
        return bok*bok;
    }

    @Override
    public double getPerimeter() {
        return 4*bok;
    }
}
