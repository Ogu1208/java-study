package com.ogu1208.mission.java_basic2;

import java.util.Scanner;

/**
 * Java 프로그램을 작성하여 사용자가 입력한 숫자가 홀수인지 짝수인지 판별합니다.
 * 판별 결과를 출력합니다.
 */
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("숫자를 입력하세요. (q 입력시 종료)");
            String s = sc.next();

            if(s.equalsIgnoreCase("q")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                try {
                    int num = Integer.parseInt(s);
                    if(num % 2 == 0) {
                        System.out.println(num + "은 짝수입니다.");
                    } else {
                        System.out.println(num + "은 홀수입니다.");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("잘못된 입력입니다. 숫자 또는 'q'를 입력해주세요.");
                }
            }
        }
    }
}
