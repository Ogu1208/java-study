package com.ogu1208.mission.java_middle.shape_abstract_interface;

public class Circle extends Shape {

    private int radius;

    public Circle(int radius) {
        super("원");
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
