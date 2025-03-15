package com.ogu1208.mission.java_middle.shapeArray;

public class Triangle implements Shape{

    private int base;
    private int height;
    private ShapeType shapeType;

    public Triangle(int base, int height, ShapeType shapeType) {
        this.base = base;
        this.height = height;
        this.shapeType = shapeType;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    public ShapeType getType() {
        return shapeType;
    }

    @Override
    public String toString() {
        return "타입: " + shapeType + ", 면적: " + String.format("%.3f", calculateArea());
    }
}
