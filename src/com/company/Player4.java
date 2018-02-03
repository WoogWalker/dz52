package com.company;

public class Player4 extends  Player{
    public Player4(int price) {
        super(price);
    }

    public void playSong(String[] playlist){
        System.out.println("Playing: " + playlist[playlist.length-1]);
    }

    public void playAllSongs (String[] playlist){
        for (int i = 0; i < playlist.length; i++){
            System.out.println(playlist[i]);
        }
    }
}