package com.company;

public class Player5 extends Player {
    public Player5(int price) {
        super(price);
    }

    public void playSong(String[] playlist){
        System.out.println("Playing: " + playlist[0]);
    }

    public void playAllSongs (String[] playlist){
        for (int i =  playlist.length-1; i >= 0; i--){
            System.out.println(playlist[i]);
        }
    }

}