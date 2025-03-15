package com.ogu1208.mission.java_middle.shapeArray;

class Circle implements Shape {
    private int radius;
    private ShapeType shapeType;

    public Circle(int radius, ShapeType shapeType) {
        this.radius = radius;
        this.shapeType = shapeType;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
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