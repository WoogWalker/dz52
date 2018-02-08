package com.company;

import java.util.*;

public class Player6 extends Player3{
    public Player6(int price) {
        super(price);
    }

    public void playSong(String[] playlist){
        super.playSong(playlist);
    }

    public void shuffle(String[] playlist){

        Random rgen = new Random();

        System.out.println("shuffle all songs:");

        List<String> list = Arrays.asList(playlist);
        Collections.shuffle(list);
        for (String lol: list){
            System.out.println(lol);
        }

//        for (int i = 0; i < playlist.length; i++) {
//            int randPos = rgen.nextInt(playlist.length);
//            String tmp = playlist[i];
//            playlist[i] = playlist[randPos];
//            playlist[randPos] = tmp;
//            System.out.println(playlist[randPos]);
//        }
    }
}