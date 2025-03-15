package com.ogu1208.mission.java_basic2;

/**
 * Java 프로그램을 작성하여 1부터 10까지의 숫자를 배열에 저장합니다.
 * 배열의 요소를 출력합니다.
 */
public class IntArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        for (int num : arr) {
            System.out.println(num);
        }
    }
}
