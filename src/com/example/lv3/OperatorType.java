package com.example.lv3;

import com.example.ZeroDivisionException;

public enum OperatorType {

    ADDITION('+'){
        @Override
        public double calculate(double a, double b) {
            return round(a + b);
        }
    },
    SUBTRACTION('-'){
        @Override
        public double calculate(double a, double b) {
            return round(a - b);
        }
    },
    MULTIPLICATION('*'){
        @Override
        public double calculate(double a, double b) {
            return round(a * b);
        }
    },
    DIVISION('/'){
        @Override
        public double calculate(double a, double b) {
            if (b == 0) {
                throw new ZeroDivisionException();
            }
            return round(a / b);
        }
    };

    private final char operator;

    public abstract double calculate(double a, double b);

    OperatorType(char operator) {
        this.operator = operator;
    }

    public static OperatorType getType(char c) {
        if (c == ADDITION.operator) {
            return OperatorType.ADDITION;
        } else if (c == SUBTRACTION.operator) {
            return OperatorType.SUBTRACTION;
        } else if (c == MULTIPLICATION.operator) {
            return OperatorType.MULTIPLICATION;
        } else {
            return OperatorType.DIVISION;
        }
    }

    //소수점 셋째 자리 까지 계산
    protected double round(double d) {
        return Math.round(d * 1000) / 1000.0;
    }

}
