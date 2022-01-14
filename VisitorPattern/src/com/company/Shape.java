package com.company;

import com.company.Visitor;

public interface Shape {
    public void move(int x , int y);
    public void draw();
    public void Accept(Visitor visitor);
}
