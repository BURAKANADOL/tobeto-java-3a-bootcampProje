package com.tobeto.bootcampProject.business.response.get.blackList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlackListResponse {
    private int id;
    private String reason;
    private  String date;
}
