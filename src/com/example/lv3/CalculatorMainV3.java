package com.example.lv3;

import java.util.Scanner;

public class CalculatorMainV3 {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            double d1 = sc.nextDouble();

            System.out.print("두 번째 숫자를 입력하세요: ");
            double d2 = sc.nextDouble();

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            Number result = calculator.calculate(d1, d2, OperatorType.getType(operator));

            if (result != null) {
                System.out.println("결과: " + result);
            } else {
                continue;
            }

            while (true) {
                System.out.print("더 계산하시겠습니까? (exit을 입력하여 종료) : ");
                String s = sc.next();

                if (s.equals("exit")) {
                    System.exit(1);
                } else {
                    break;
                }
            }

        }
    }
}
