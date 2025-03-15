package com.ogu1208.mission.java_basic2;

import java.util.Scanner;

/**
 * (Java) 두 개의 정수를 더하고 빼는 메서드 작성하기
 * Java 프로그램을 작성하여 두 개의 정수를 입력받습니다. 입력받은 정수에 대한 더하기와 빼기 연산 결과를 출력합니다.
 */
public class AddSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("두 정수 " + a + "와 " + b + "를 더하면 : " + (a + b));
        System.out.println("두 정수 " + a + "와 " + b + "를 빼면 : " + (a - b));
    }
}
