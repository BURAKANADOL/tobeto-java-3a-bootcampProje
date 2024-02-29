package com.tobeto.bootcampProject.business.response.create;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBlackListResponse {
    private int id;

    private String reason;
    private  String date;
}