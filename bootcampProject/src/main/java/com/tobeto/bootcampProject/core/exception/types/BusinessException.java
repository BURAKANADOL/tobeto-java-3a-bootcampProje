package com.tobeto.bootcampProject.core.exception.types;

public class BusinessException extends RuntimeException {
    public BusinessException(String message) {
        super(message);
    }
}