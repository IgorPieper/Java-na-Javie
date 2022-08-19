package com.company;

public class Wiatrak {
    final int SLOW = 1;
    final int MEDIUM = 2;
    final int FAST = 3;
    int speed;
    boolean on;
    int radius;
    String color;

    public Wiatrak() {
    }

    public Wiatrak(int speed, boolean on, int radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public void informacje(int speed, boolean on, int radius, String color){
        System.out.printf("%d %b %d %s", speed, on, radius, color);
    }
}
