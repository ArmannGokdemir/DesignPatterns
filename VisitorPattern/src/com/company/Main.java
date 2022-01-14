package com.company;

public class Main {

    public static void main(String[] args) {
	 Circle circle = new Circle();
     Rectangle rectangle = new Rectangle();
     Dot dot = new Dot();

     XMLExportVisitor visitor = new XMLExportVisitor();

     dot.Accept(visitor);
     rectangle.Accept(visitor);
     circle.Accept(visitor);


    }
}
