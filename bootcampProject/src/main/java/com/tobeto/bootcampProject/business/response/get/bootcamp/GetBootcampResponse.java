package com.tobeto.bootcampProject.business.response.get.bootcamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBootcampResponse {
    private int id;
    private String name;
    private  String startDate;
    private String endDate;
}
