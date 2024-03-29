package com.tobeto.bootcampProject.business.response.update;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateApplicationResponse {
    private int id;
    private int applicantId;
    private int bootcampId;
    private int applicationStateId;
}
