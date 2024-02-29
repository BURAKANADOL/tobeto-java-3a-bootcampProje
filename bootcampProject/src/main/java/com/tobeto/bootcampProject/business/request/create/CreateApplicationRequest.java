package com.tobeto.bootcampProject.business.request.create;

import com.tobeto.bootcampProject.entities.concretes.ApplicationState;
import com.tobeto.bootcampProject.entities.concretes.Bootcamp;
import com.tobeto.bootcampProject.entities.concretes.User;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateApplicationRequest {
    private  int id;
    private int applicantId;
    private int applicationStateId;
    private int bootcampId;


}
