package com.tobeto.bootcampProject.core.exception.types;

public class BusinessException extends RuntimeException{
    private static final long serialVersiyonUID =1L;
    public BusinessException(String message) {
        super(message);

    }
}