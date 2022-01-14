package com.company;

public class Rectangle implements Shape{
    @Override
    public void move(int x, int y) {
        System.out.println("moved to x: "+x+" y: "+y+" coordinates");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle drawn");
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);

    }
}
