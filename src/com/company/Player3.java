package com.company;

public class Player3 extends Player{
    public Player3(int price) {
        super(price);
    }

    public void playSong(String[] playlist){
        System.out.println("Playing: " + playlist[0]);
    }
}