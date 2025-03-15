package com.ogu1208.mission.java_basic2;

import java.util.Arrays;
import java.util.Scanner;

/**
 * (Java) 배열의 평균을 계산하고 배열 요소를 변경하는 메서드 작성하기
 * Java 프로그램을 작성하여 배열에 저장된 숫자의 평균을 계산합니다.
 * 배열 요소를 변경하고 변경된 결과를 출력합니다.
 * 프로그램 실행 결과의 스크린샷을 찍어 결과물로 제출합니다.
 */
public class CalculateArrayMean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("입력받을 정수 배열의 크기 : ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int sum = 0;

        System.out.println(size + "개의 정수를 입력하세요: ");
        for (int i = 0; i <size; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("arr 배열 : " + Arrays.toString(arr));
        System.out.println("배열에 저장된 숫자의 평균: " + ((float)sum / size));

        // 배열 요소 변경
        modifyArray(arr);

        // 변경된 배열 출력
        System.out.println(Arrays.toString(arr));
    }

    // 배열의 값을 2배수로 변경하는 메서드
    public static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}
