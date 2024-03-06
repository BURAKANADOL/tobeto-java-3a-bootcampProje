package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;
import org.springframework.http.ResponseEntity;

public class BaseController {
    public ResponseEntity<?> handleDataResult(DataResult<?> dataResult) {
        if(dataResult.isSuccess()) {
            return ResponseEntity.ok(dataResult);
        }
        return ResponseEntity.badRequest().body(dataResult);
    }

    public ResponseEntity<?> handleResult(Result result) {
        if(result.isSuccess()) {
            return ResponseEntity.ok(result);
        }
        return ResponseEntity.badRequest().body(result);
    }
}