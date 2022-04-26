package com.company;

public class Main {

    public static void main(String[] args) {
	Square s1 = new Square(4);
    Square s2 = new Square(10);
    Triangle t1 = new Triangle(3, 4, 5, 4);
    Triangle t2 = new Triangle(6, 8, 10, 8);

    Shape[] nazwa = new Shape[] {s1, s2, t1, t2};

        for (Shape x: nazwa) {
            System.out.println(x.getArea());
            System.out.println(x.getPerimeter());
        }
    }
}
