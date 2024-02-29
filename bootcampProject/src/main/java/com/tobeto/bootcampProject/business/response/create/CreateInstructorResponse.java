package com.tobeto.bootcampProject.business.response.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CreateInstructorResponse {
    private  int id;
    private String companyName;

}