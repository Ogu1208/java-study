package com.ogu1208.mission.java_middle.figure;

import static com.ogu1208.mission.java_middle.figure.FigureMain.formatArea;

/**
 * 도형 인터페이스를 작성하고, 도형의 면적을 계산하는 메서드를 선언합니다.
 * 도형 인터페이스를 구현한 구체적인 도형 클래스(원, 사각형, 삼각형 등)를 작성합니다.
 * 도형 인터페이스를 구현한 클래스의 객체를 생성하고, 면적을 계산하여 출력합니다.
 * 결과물로 도형 인터페이스를 구현한 클래스를 생성하고, 면적을 계산하여 출력하는 스크린샷을 제출합니다.
 */
public interface Figure {
    double calculateArea();
}

class Circle implements Figure {
    private double radius;

    public Circle(double redius) {
        this.radius = redius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "원의 반지름: " + radius + ", 면적(3째자리 반올림): " + formatArea(calculateArea());
    }
}

class Rectangle implements Figure {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "사각형의 가로: " + width + "세로: " + height + ", 면적(3째자리 반올림): " + formatArea(calculateArea());
    }
}

class Triangle implements Figure {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * height * base;
    }

    @Override
    public String toString() {
        return "삼각형의 밑변: " + base + "높이: " + height + ", 면적(3째자리 반올림): " + formatArea(calculateArea());
    }
}
