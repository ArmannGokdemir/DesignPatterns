package com.company;

public abstract class PlayerHandler {

    protected PlayerHandler nextHandler;

    public void setNextHandler(PlayerHandler nextHandler){
        this.nextHandler=nextHandler;
    }


    public void play(String file){

    }

}
