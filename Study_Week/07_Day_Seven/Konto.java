package com.company;

public class Konto {

    int id;
    public double money;

    public Konto(int id, double money) {
        this.id = id;
        this.money = money;
    }

    public double balance(){
        return money;
    }

    public void withdraw(double mniej){

        if (mniej>=money){
            System.out.println("Nie posiadasz wystarczająco funduszy");
        } else{
            this.money=money-mniej;
        }
    }

    public void deposit(double wiecej){
        this.money=money+wiecej;
    }

}
