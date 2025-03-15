package com.ogu1208.mission.java_basic2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Java) 5개의 정수 오름차순 정렬하기
 * Java 프로그램을 작성하여 사용자가 입력한 5개의 정수를 오름차순으로 정렬합니다. 정렬된 결과를 출력합니다
 */
public class AscendingSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.println("5개의 정수를 입력하세요:  ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("오름차순으로 정렬된 배열: " + Arrays.toString(arr));
    }
}
