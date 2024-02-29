package com.tobeto.bootcampProject.business.response.get.application;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllApplicationResponse {
    private  int id;
    private int applicantId;
    private int applicationStateId;
    private int bootcampId;

}

