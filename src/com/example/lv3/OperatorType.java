package com.example.lv3;

import com.example.ZeroDivisionException;

public enum OperatorType {

    ADDITION('+'){
        @Override
        public Double calculate(double a, double b) {
            return a + b;
        }
    },
    SUBTRACTION('-'){
        @Override
        public Double calculate(double a, double b) {
            return a - b;
        }
    },
    MULTIPLICATION('*'){
        @Override
        public Double calculate(double a, double b) {
            return a * b;
        }
    },
    DIVISION('/'){
        @Override
        public Double calculate(double a, double b) {
            if (b == 0) {
                throw new ZeroDivisionException();
            }
            return a / b;
        }
    };

    private final char operator;

    public abstract Double calculate(double a, double b);

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

}
