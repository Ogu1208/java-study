package com.ogu1208.mission.java_middle.shapeArray;

import static com.ogu1208.mission.java_middle.shapeArray.ShapeType.*;

/**
 * 도형 클래스를 작성하고, 도형의 종류와 면적을 저장하는 멤버 변수를 가집니다.
 * 다양한 도형 객체(원, 사각형, 삼각형 등)를 생성하고 도형 배열에 저장합니다.
 * 도형 배열의 각 도형 객체에 대해 면적을 계산하여 출력합니다.
 * 결과물로 다양한 도형 객체를 생성하고 배열에 저장한 뒤, 각 도형의 면적을 출력하는 스크린샷을 제출합니다.
 */
public class ShapeArray {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                new Circle(5, CIRCLE),
                new Rectangle(5, 5, RECTANGLE),
                new Triangle(6, 5, TRIANGLE)
        };

        for (int i = 0; i < shapes.length; i++) {
            System.out.println("shapes[" + i + "] = " + shapes[i]);
        }
    }
};
