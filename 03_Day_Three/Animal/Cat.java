package com.company;

public class Cat extends Animal{

    public Cat(String name, String color) {
        super(name, color);
    }

    public void makeSound() {
        System.out.println("Miau," + name + ", " +  color);
    }
}
