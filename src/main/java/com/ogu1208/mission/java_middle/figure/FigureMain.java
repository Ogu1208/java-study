package com.ogu1208.mission.java_middle.figure;

public class FigureMain {
    public static void main(String[] args) {
        Figure circle = new Circle(5);
        Figure rectangle = new Rectangle(5, 5);
        Figure triangle = new Triangle(6, 5);

        System.out.println(circle.toString());
        System.out.println(rectangle.toString());
        System.out.println(triangle.toString());
    }

    public static String formatArea(double area) {
        return String.format("%.3f", area);
    }
}
