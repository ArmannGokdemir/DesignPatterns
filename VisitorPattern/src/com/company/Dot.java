package com.company;

public class Dot implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.println("moved to x: "+x+" y: "+y+" coordinates");
    }

    @Override
    public void draw() {
        System.out.println("Dot drawn");
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);

    }
}
