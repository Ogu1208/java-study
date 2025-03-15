package com.ogu1208.mission.java_middle.shape_abstract_interface;

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);
        Triangle triangle = new Triangle(3, 4);

        // 도형 객체 배열
        Shape[] shapes = {circle, rectangle, triangle};

        System.out.println("===== 추상 클래스 이용 =====");
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }

        System.out.println("\n===== 인터페이스 이용 =====");
        System.out.println(triangle.toString());

        System.out.println("\n===== 인터페이스 타입 참조 =====");
        IShape iTriangle = triangle;

        System.out.println( "iTriangle의 면적: " + iTriangle.getArea());
    }
}
