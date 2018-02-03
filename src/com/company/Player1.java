package com.company;

public class Player1 extends Player {
    public Player1(int price) {
        super(price);
    }

    public void playSong(String songName){
        System.out.println("Playing: " + songName);
    }
}