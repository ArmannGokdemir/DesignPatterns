package com.company;

public class Main {

    public static void main(String[] args) {
        PlayerHandler mp4Player = new Mp4Player();
        PlayerHandler mpgPlayer = new MpgPlayer();
        PlayerHandler aviPlayer = new AviPlayer();

        mp4Player.setNextHandler(mpgPlayer);
        mpgPlayer.setNextHandler(aviPlayer);

        mp4Player.play("arman.avi");
        mp4Player.play("arman.mpg");
        mp4Player.play("arman");
	// write your code here
    }
}
