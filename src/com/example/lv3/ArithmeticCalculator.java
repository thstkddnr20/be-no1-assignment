package com.example.lv3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {
    protected List<Number> resultData;

    public ArithmeticCalculator() {
        this.resultData = new ArrayList<>();
    }

    public List<Number> getResultData() {
        return resultData;
    }

    public void setResultData(List<Number> resultData) {
        this.resultData = resultData;
    }

    public void removeResult() {
        resultData.remove(0);
    }

    public void printBigger(Number num) {
        double val = num.doubleValue();

        System.out.println("=== 저장된 값 중 " + num + "보다 더 큰값을 출력합니다 ===");
        resultData.stream()
                .map(Number::doubleValue)
                .filter(d -> d > val)
                .forEach(System.out::println);
        System.out.println("=== 출력 종료 ===");

    }

    public <E extends Number> Number calculate(E e1, E e2, OperatorType operator) {
        double num1 = e1.doubleValue();
        double num2 = e2.doubleValue();

        Number result = operator.calculate(num1, num2);

        printBigger(num1);
        printBigger(num2);

        if (result != null) {
            resultData.add(result);
        }
        return result;
    }

}
