package com.tobeto.bootcampProject.core.utilities.results;

import java.util.List;

public class DataResult <T> extends Result{
    private T data;
    public DataResult (T data,boolean success,String message){
        super(success,message);
        this.data=data;

    }
    public DataResult(T data,boolean success){
        super(success);
        this.data=data;
    }
    public  T getData(){
        return this.data;
    }

    public static <T> DataResult<List<T>> success(List<T> data, String message) {
        return new DataResult<>(data, true, message);
    }

    public static <T> DataResult<List<T>> success(List<T> data) {
        return new DataResult<>(data, true);
    }


}