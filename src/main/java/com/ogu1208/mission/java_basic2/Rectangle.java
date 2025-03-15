package com.ogu1208.mission.java_basic2;

import java.util.Scanner;

/**
 * (Java) 사용자로부터 직사각형의 가로와 세로를 입력받아 넓이 출력하기
 * Java 프로그램을 작성하여 사용자로부터 직사각형의 가로와 세로를 입력받습니다.
 * 입력받은 직사각형의 넓이를 출력합니다. 프로그램 실행 결과의 스크린샷을 찍어 결과물로 제출합니다.
 */
public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("직사각형의 가로 길이: ");
        int width = sc.nextInt();
        System.out.println("직사각형의 세로 길이: ");
        int height = sc.nextInt();

        System.out.println("직사각형의 넓이는 " + width * height + "입니다.");
    }
}
