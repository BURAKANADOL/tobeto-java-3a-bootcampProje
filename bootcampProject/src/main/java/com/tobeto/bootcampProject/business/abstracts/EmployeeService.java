package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.response.create.CreateEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetEmployeeResponse;

import java.util.List;

public interface EmployeeService {

    CreateEmployeeResponse add(CreateEmployeeRequest request);
    List<GetAllEmployeeResponse> getAllEmployee();
    GetEmployeeResponse getByPosition(String position);


}
