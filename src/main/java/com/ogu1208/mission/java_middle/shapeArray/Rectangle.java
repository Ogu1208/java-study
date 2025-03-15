package com.ogu1208.mission.java_middle.shapeArray;

public class Rectangle implements Shape{
    private int width;
    private int height;
    private ShapeType shapeType;

    public Rectangle(int width, int height, ShapeType shapeType) {
        this.width = width;
        this.height = height;
        this.shapeType = shapeType;
    }

    @Override
    public double calculateArea() {
        return width * height;
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
