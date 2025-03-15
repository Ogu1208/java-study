package com.ogu1208.mission.java_middle.shape_abstract_interface;

public class Triangle extends Shape implements IShape{

    private int base;
    private int height;

    public Triangle(int base, int height) {
        super(("삼각형"));
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getArea() {
        return calculateArea();
    }
}
