package com.tobeto.bootcampProject.business.response.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateApplicationStateResponse {
    private int id;
    private String name;
}
