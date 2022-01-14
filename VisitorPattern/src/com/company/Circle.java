package com.company;

import java.awt.*;

public class Circle implements Shape {
    @Override
    public void move(int x, int y) {
        System.out.println("moved to x: "+x+" y: "+y+" coordinates");
    }

    @Override
    public void draw() {
        System.out.println("Circle drawn");
    }

    @Override
    public void Accept(Visitor visitor) {
        visitor.Visit(this);

    }
}
