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

    public void playSong(String songName){
        System.out.println("Playing: " + songName);
    }

    public void playAllSongs (String[] playlist){
        for (int i = 0; i < playlist.length; i++){
            System.out.println(playlist[i]);
        }
    }
}