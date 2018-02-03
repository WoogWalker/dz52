package com.company;

public class Player {
    private int price;

    public Player(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void show(){
        System.out.println("price: " + this.price);
    }

}