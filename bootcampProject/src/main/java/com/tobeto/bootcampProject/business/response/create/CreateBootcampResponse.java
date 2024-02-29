package com.tobeto.bootcampProject.business.response.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBootcampResponse {
    private int id;
    private String name;
    private  String startDate;
    private String endDate;
}