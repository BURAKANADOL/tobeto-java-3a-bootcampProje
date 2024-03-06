package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateEmployeeRequest;
import com.tobeto.bootcampProject.business.response.create.CreateEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetEmployeeResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateEmployeeResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface EmployeeService {
    DataResult<CreateEmployeeResponse> add(CreateEmployeeRequest request);

    DataResult<List<GetAllEmployeeResponse>> getAll();

    DataResult<GetEmployeeResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateEmployeeResponse> update(UpdateEmployeeRequest request);

    DataResult<List<GetAllEmployeeResponse>> getAllPage(PageDto pageDto);

    List<GetAllEmployeeResponse> getAllEmployee();

    GetEmployeeResponse getByPosition(String position);
}