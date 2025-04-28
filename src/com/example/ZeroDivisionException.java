package com.example;

public class ZeroDivisionException extends RuntimeException {
    public ZeroDivisionException() {
        super("두 번째 정수가 0일 경우 나머지를 할 수 없습니다");
    }
}
