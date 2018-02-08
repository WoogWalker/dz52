package com.company;

public class Main {

    public static void main(String[] args) {

        String song1 = "str 1, The best song";
        String[] playlist = new String[] {"arr 1, The best song", "arr 2, Good song", "arr 3, Super song"};

        System.out.println("Player#1");
        Player1 p1 = new Player1(100);
        p1.show();
        p1.playSong(song1);

        System.out.println("_______________");

        System.out.println("Player#2");
        Player2 p2 = new Player2(200);
        p2.show();
        p2.playSong(song1);

        System.out.println("_______________");

        System.out.println("Player#3");
        Player3 p3 = new Player3(300);
        p3.show();
        p3.playSong(playlist);
        p3.playAllSongs(playlist);

        System.out.println("_______________");

        System.out.println("Player#4");
        Player4 p4 = new Player4(400);
        p4.show();
        p4.playSong(playlist);
        p4.playAllSongs(playlist);

        System.out.println("_______________");

        System.out.println("Player#5");
        Player5 p5 = new Player5(500);
        p5.show();
        p5.playSong(playlist);
        p5.playAllSongs(playlist);

        System.out.println("_______________");

        System.out.println("Player#6");
        Player6 p6 = new Player6(600);
        p6.show();
        p6.playSong(playlist);
        p6.playAllSongs(playlist);
        p6.shuffle(playlist);

    }
}