package com.company;

public class Player4 extends  Player{
    public Player4(int price) {
        super(price);
    }

    public void playSong(String[] playlist){
        System.out.println("Playing: " + playlist[playlist.length-1]);
    }

}