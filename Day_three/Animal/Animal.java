package com.company;

public class Animal {
    protected String name;
    protected String color;

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void makeSound(){
        System.out.println("Dźwięk," + name + ", " +  color);
    }
}
