package com.ogu1208.mission.java_basic1;

import java.util.Scanner;

public class Mission3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int age = sc.nextInt();

        System.out.println("제 이름은 " + name + "이고, 나이는 " + age + "살 입니다.");
    }
}
