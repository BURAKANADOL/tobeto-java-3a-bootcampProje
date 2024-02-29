package com.tobeto.bootcampProject;

import com.tobeto.bootcampProject.core.exception.types.BusinessException;
import com.tobeto.bootcampProject.core.utilities.results.ErrorDataResult;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@SpringBootApplication
@RestControllerAdvice
public class JavaBootcampApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaBootcampApplication.class, args);


	}
	@Bean
	public ModelMapper getModelMapper(){
		return new ModelMapper();
	}



}