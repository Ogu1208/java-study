package com.ogu1208.mission.java_middle.lambda;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * 사용자로부터 두 개의 숫자와 연산자를 입력받습니다.
 * 람다 표현식을 사용하여 입력받은 숫자와 연산자에 따른 계산 기능을 구현합니다.
 * 계산 결과를 출력합니다. 결과물로 사용자 입력을 받아 람다 표현식으로 구현된 계산 기능을 수행하는 스크린샷을 제출합니다.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();

        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> b != 0 ? a / b : null); // 0으로 나누기 방지
        operations.put("%", (a, b) -> b != 0 ? a % b : null);

        double num1 = getValidNumber(sc, "첫 번째 숫자를 입력하세요: ");
        System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
        String operator = sc.next();

        double num2 = getValidNumber(sc, "두 번째 숫자를 입력하세요: ");

        BiFunction<Double, Double, Double> operation = operations.get(operator);

        if (operation != null) {
            Double result = operation.apply(num1, num2);
            if (result == null) {
                System.out.println("[Error]: 0으로 나눌 수 없습니다.");
            } else {
                System.out.println("결과: " + result);
            }
        } else {
            System.out.println("[Error]: 잘못된 연산자입니다. (+, -, *, /, % 중에서 선택하세요.)");
        }

        sc.close();
    }

    private static double getValidNumber(Scanner sc, String message) {
        while (true) {
            System.out.print(message);
            String input = sc.nextLine(); // 한 번만 입력 받음
            try {
                return Double.parseDouble(input); // 숫자로 변환 시도
            } catch (NumberFormatException e) {
                System.out.println("[Error]: 유효한 숫자를 입력하세요.");
            }
        }
    }
}
