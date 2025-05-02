package com.example;

public class OperationSymbolException extends RuntimeException {
    public OperationSymbolException() {
        super("올바른 연산 기호를 입력하세요");
    }
}
