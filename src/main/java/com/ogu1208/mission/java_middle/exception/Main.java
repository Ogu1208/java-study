package com.ogu1208.mission.java_middle.exception;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.BiFunction;

/**
 * 사용자로부터 두 개의 숫자와 연산자를 입력받는 계산기 프로그램을 작성합니다.
 * 사용자 입력 값이 잘못되었을 때 예외 처리를 구현하여 적절한 오류 메시지를 출력합니다.
 * 예외 처리가 동작하는 것을 확인할 수 있도록 프로그램을 실행하고 결과를 확인합니다.
 * 결과물로 사용자 입력 값이 잘못되었을 때 예외 처리가 동작하는 스크린샷을 제출합니다.
 */
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();

        operations.put("+", (a, b) -> a + b);
        operations.put("-", (a, b) -> a - b);
        operations.put("*", (a, b) -> a * b);
        operations.put("/", (a, b) -> b != 0 ? a / b : null);
        operations.put("%", (a, b) -> b != 0 ? a % b : null);

        try {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double num1 = Double.parseDouble(sc.nextLine());

            System.out.print("연산자를 입력하세요(+, -, *, /, %): ");
            String operator = sc.nextLine();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double num2 = Double.parseDouble(sc.nextLine());

            // 연산 수행 및 결과 출력
            BiFunction<Double, Double, Double> operation = operations.get(operator);

            if(operation != null) {
                Double result = operation.apply(num1, num2);
                if (result == null) {
                    System.out.println("[Error]: 0으로 나눌 수 없습니다.");
                } else {
                    System.out.println("결과: " + result);
                }
            } else {
                System.out.println("[Error]: 잘못된 연산자입니다.");
            }
        } catch (NumberFormatException e) {
            System.out.println("[Error]: 유효한 숫자를 입력해주세요.");
        } catch (Exception e) {
            System.out.println("[Error]: 예기치 않은 오류가 발생했습니다.");
        } finally {
            sc.close();
        }
    }
}
