package com.ogu1208.mission.java_middle.shape_abstract_interface;

public class Rectangle extends Shape{

    private int width;
    private int height;

    public Rectangle(int width,  int height) {
        super("사각형");
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }
}
