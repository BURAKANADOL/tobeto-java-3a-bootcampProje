package com.tobeto.bootcampProject.business.response.get.blackList;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetBlackListResponse {
    private int id;
    private String reason;
    private LocalDateTime date;
    private String applicantFirstName;
}