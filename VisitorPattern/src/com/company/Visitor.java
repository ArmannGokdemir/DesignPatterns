package com.company;

public interface Visitor {
    public void Visit(Circle circle);
    public void Visit(Rectangle rectangle);
    public void Visit(Dot dot);
}
