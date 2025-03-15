package com.ogu1208.mission.java_middle.reverseStrng;

import java.util.Scanner;

/**
 * 사용자로부터 문자열을 입력받습니다. 입력받은 문자열을 뒤집어 출력합니다.
 * 입력받은 문자열의 대소문자를 변환하여 출력합니다.
 * 결과물로 사용자가 입력한 문자열을 뒤집고 대소문자를 변환하여 출력하는 스크린샷을 제출합니다.
 */
public class ReverseString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("문자열을 입력하세요");
        String input = sc.nextLine();

        System.out.println("문자열을 뒤집고 대소문자를 변환한 결과 : " + switchCase(reverseString(input)));
    }

    public static String reverseString(String str) {
        StringBuffer reversedString = new StringBuffer(str);
        return reversedString.reverse().toString();
    }

    public static String switchCase(String str) {
        StringBuffer switchedString = new StringBuffer(str);

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if(Character.isUpperCase(c)) {
                switchedString.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                switchedString.append(Character.toUpperCase(c));
            } else {
                switchedString.append(c);
            }
        }

        return switchedString.toString();
    }
}
