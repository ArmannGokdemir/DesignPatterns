package com.company;

public class Factory {

    public Shape getShape(String shape){
        if(shape == "rectangle"){
            return new Rectangle();
        }
        if(shape == "square"){
            return new Square();
        }
        if(shape == "circle"){
            return new Circle();
        }
    return null;
    }

}
