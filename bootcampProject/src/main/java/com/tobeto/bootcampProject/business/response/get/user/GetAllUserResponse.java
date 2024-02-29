package com.tobeto.bootcampProject.business.response.get.user;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllUserResponse {
    private int id;
    private String userName;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String nationalIdentity;
    private String email;
    private String password;
    private LocalDateTime createdDate;
    private LocalDateTime updatedDate;
    private LocalDateTime deletedDate;
}
