package com.ogu1208.mission.java_middle.arraySort;

import java.util.Arrays;
import java.util.Scanner;

/**
 * 사용자로부터 정수 배열을 입력받습니다. 버블 정렬, 선택 정렬 등의 간단한 정렬 알고리즘을 구현하여 배열을 정렬합니다.
 * 정렬 전후의 배열 상태를 출력합니다. 결과물로 정렬 전후의 배열 상태를 보여주는 스크린샷을 제출합니다.
 */
public class M1_ArraySort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("배열의 크기를 입력해주세요 : ");
        int size = sc.nextInt();
        int[] arr = new int[size];

        System.out.println("배열의 값을 입력해주세요.");
        for (int i = 0; i < size; i++) {
            System.out.println(i + "번째 배열의 값 : ");
            arr[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(arr)); // 원본 배열

        // 버블 정렬
        int[] bubbleSortedArray = arr.clone();
        bubbleSort(bubbleSortedArray);
        System.out.println("=====버블 정렬=====");
        System.out.println(Arrays.toString(bubbleSortedArray));

        // 선택 정렬
        System.out.println("=====선택 정렬=====");
        int[] selectionSortedArray = arr.clone();
        selectionSort(selectionSortedArray);
        System.out.println(Arrays.toString(selectionSortedArray));
    }

    // 뒷쪽부터 병렬
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
