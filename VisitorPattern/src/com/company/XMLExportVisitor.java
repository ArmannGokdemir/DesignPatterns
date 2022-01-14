package com.company;

public class XMLExportVisitor implements Visitor{
    @Override
    public void Visit(Circle circle) {
        System.out.println("Exported circles coordinates to xml format");

    }

    @Override
    public void Visit(Rectangle rectangle) {
        System.out.println("Exported rectangle coordinates to xml format");
    }

    @Override
    public void Visit(Dot dot) {
        System.out.println("Exported dot coordinates to xml format");

    }
}
