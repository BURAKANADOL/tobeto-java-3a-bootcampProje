package com.tobeto.bootcampProject.core.exception.problemDetails;


import org.springframework.http.HttpStatus;

public class InternalServerErrorProblemDetail extends ProblemDetails {

    public InternalServerErrorProblemDetail() {
        setTitle("Validation Rule Violation");

        setType("http://tobeto.com/exceptions/internal");
        setStatus(HttpStatus.INTERNAL_SERVER_ERROR.toString());
    }
}



