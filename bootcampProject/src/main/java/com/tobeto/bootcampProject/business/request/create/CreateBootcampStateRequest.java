package com.tobeto.bootcampProject.business.request.create;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateBootcampStateRequest {
    private int id;
    private String name;

}
