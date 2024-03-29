package com.tobeto.bootcampProject.business.response.get.instructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetInstructorResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String email;
    private String companyName;
}