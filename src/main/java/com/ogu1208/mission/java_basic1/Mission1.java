package com.ogu1208.mission.java_basic1;

import java.util.Scanner;

public class Mission1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a > b ? a : b);
    }
}
