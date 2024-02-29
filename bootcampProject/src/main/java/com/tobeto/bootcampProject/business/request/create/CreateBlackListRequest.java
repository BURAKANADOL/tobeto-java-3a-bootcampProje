package com.tobeto.bootcampProject.business.request.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBlackListRequest {
    private int id;
    private String reason;
    private  String date;

}