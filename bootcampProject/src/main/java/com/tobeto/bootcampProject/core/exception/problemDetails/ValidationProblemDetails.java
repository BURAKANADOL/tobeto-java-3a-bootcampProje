package com.tobeto.bootcampProject.core.exception.problemDetails;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.util.Map;
@Data
public class ValidationProblemDetails extends ProblemDetails{
    public ValidationProblemDetails (){
        setTitle("Validation Rule Violation");
        setDetail("Validasyon Problemi");
        setType("http://tobeto.com/exceptions/validation");
        setStatus(HttpStatus.BAD_REQUEST.toString());
    }
    private Map<String , String> errors;
}