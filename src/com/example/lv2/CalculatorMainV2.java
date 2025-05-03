package com.example.lv2;

import com.example.OperationSymbolException;
import com.example.ZeroDivisionException;

import java.util.Scanner;

public class CalculatorMainV2 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
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

            try {
                Integer result = calculator.calculate(i1, i2, operator);
                System.out.println("결과: " + result);
            } catch (ZeroDivisionException | OperationSymbolException e) {
                System.out.println(e.getMessage());
                continue;
            }
            //리스트 맨 앞 요소 삭제 가능
            //calculator.removeResult();

            System.out.print("더 계산하시겠습니까? (exit을 입력하여 종료) : ");
            String s = sc.next();

            if (s.equals("exit")) {
                break;
            }

        }
    }

}