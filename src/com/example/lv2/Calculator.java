package com.example.lv2;

import com.example.ZeroDivisionException;

import java.util.ArrayList;
import java.util.List;

public class Calculator {
    private List<Integer> resultData;

    public Calculator() {
        this.resultData = new ArrayList<>();
    }

    public List<Integer> getResultData() {
        return resultData;
    }

    public void setResultData(List<Integer> resultData) {
        this.resultData = resultData;
    }

    public void removeResult() {
        resultData.remove(0);
    }

    public Integer calculate(int i1, int i2, char operator) {
        Integer result = null;

        if (operator == '+') {
            result = i1 + i2;
        } else if (operator == '-') {
            result = i1 - i2;
        } else if (operator == '*') {
            result = i1 * i2;
        } else if (operator == '/'){
            if (i2 == 0) {
                throw new ZeroDivisionException();
            }
            else {
                result = i1 / i2;
            }
        } else {
            System.out.println("올바른 연산 기호를 입력하세요");
        }

        if (result != null) {
            resultData.add(result);
        }
        return result;
    }
}
