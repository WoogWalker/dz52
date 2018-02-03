package com.company;

public class Player3 extends Player{
    public Player3(int price) {
        super(price);
    }

    public void playSong(String[] playlist, int songNum){
        System.out.println("Playing: " + playlist[songNum]);
    }

    public void playAllSongs (String[] playlist){
        for (int i = 0; i < playlist.length; i++){
            System.out.println(playlist[i]);
        }
    }
}