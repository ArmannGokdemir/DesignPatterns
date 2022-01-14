package com.company;

public class Mp4Player extends PlayerHandler{
    @Override
    public void play(String file){

        if(file.contains("mp4")){
            System.out.println("Playing "+file+" mp4 file");
        }
        else{
            if(this.nextHandler!=null){
                this.nextHandler.play(file);
            }
            else{
                System.out.println("Invalid file form");
            }
        }

    }

}
