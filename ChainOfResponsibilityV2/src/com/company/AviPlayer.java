package com.company;

public class AviPlayer extends PlayerHandler{
    @Override
    public void play(String file){
        if(file.contains("avi")){
            System.out.println("Playing "+file+" avi file");
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
