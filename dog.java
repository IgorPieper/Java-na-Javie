package com.company;

public class Dog {

    String breed;
    int age;
    String color;

    public Dog(String breed, int age, String color) {
        this.breed = breed;
        this.age = age;
        this.color = color;
    }

    public void bark(){
        System.out.println("HauHau");
    }

    public void sleep(){
        System.out.println("zzzZZZ");
    }

}
