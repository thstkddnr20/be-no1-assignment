package com.example.lv1;

import java.util.Scanner;

public class CalculatorMainV1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int i1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요: ");
            int i2 = sc.nextInt();

            if (i1 < 0 || i2 < 0) {
                System.out.println("양의 정수를 입력해주세요");
                continue;
            }

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            int result;
            if (operator == '+') {
                result = i1 + i2;
            } else if (operator == '-') {
                result = i1 - i2;
            } else if (operator == '*') {
                result = i1 * i2;
            } else if (operator == '/'){
                if (i2 == 0) {
                    System.out.println("두번 째 정수가 0일 경우 나머지를 할 수 없습니다");
                    continue;
                }
                else {
                    result = i1 / i2;
                }
            } else {
                System.out.println("올바른 연산 기호를 입력하세요");
                continue;
            }

            System.out.println("결과: " + result);

            System.out.print("더 계산하시겠습니까? (exit을 입력하여 종료) : ");
            String s = sc.next();

            if (s.equals("exit")) {
                break;
            }

        }
    }

}