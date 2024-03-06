package com.tobeto.bootcampProject.business.response.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String position;
}