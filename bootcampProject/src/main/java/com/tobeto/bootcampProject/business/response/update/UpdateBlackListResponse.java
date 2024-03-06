package com.tobeto.bootcampProject.business.response.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateBlackListResponse {
    private int id;
    private String reason;
    private LocalDateTime date;
    private int applicantId;
}
