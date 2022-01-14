package com.company;

public class MpgPlayer extends PlayerHandler{
    @Override
    public void play(String file){

        if(file.contains("mpg")){
            System.out.println("Playing "+file+" mpg file");
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
