package com.ogu1208.mission.java_middle.rectangle;

public class MainRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(6, 5);

        System.out.println("사각형의 넓이는 : " + rectangle.getArea());
        System.out.println("사각형의 둘레는 : " + rectangle.getCircumference());
    }
}
