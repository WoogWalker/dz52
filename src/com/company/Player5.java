package com.company;

public class Player5 extends Player3 {
    public Player5(int price) {
        super(price);
    }

    public void playSong(String[] playlist){
        super.playSong(playlist);
    }

    public void playAllSongs (String[] playlist){
        for (int i =  playlist.length-1; i >= 0; i--){
            System.out.println(playlist[i]);
        }
    }
}