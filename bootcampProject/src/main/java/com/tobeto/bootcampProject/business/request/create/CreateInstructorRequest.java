package com.tobeto.bootcampProject.business.request.create;

import jdk.jfr.Name;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateInstructorRequest {
    private int id;
    private String companyName;
}
