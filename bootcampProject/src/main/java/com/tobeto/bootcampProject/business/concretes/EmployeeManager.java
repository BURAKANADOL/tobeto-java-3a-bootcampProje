package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.request.create.CreateEmployeeRequest;

import com.tobeto.bootcampProject.business.request.update.UpdateEmployeeRequest;
import com.tobeto.bootcampProject.business.response.create.CreateEmployeeResponse;

import com.tobeto.bootcampProject.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetEmployeeResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateEmployeeResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;
import com.tobeto.bootcampProject.dataAccess.abstracts.EmployeeRepository;
import com.tobeto.bootcampProject.entities.concretes.Employee;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor

public class EmployeeManager implements EmployeeService {
    @Override
    public DataResult<List<GetAllEmployeeResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetEmployeeResponse> getById(int id) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }

    @Override
    public DataResult<UpdateEmployeeResponse> update(UpdateEmployeeRequest request) {
        return null;
    }

    @Override
    public DataResult<List<GetAllEmployeeResponse>> getAllPage(PageDto pageDto) {
        return null;
    }

    private EmployeeRepository employeeRepository;
    private ModelMapperService mapperService;

    @Override
    public CreateEmployeeResponse add(CreateEmployeeRequest request) {
        Employee employee =mapperService.forRequest().map(request,Employee.class);
        employee.setPosition(request.getPosition());
        employeeRepository.save(employee);
        CreateEmployeeResponse response =mapperService.forResponse().map(employee, CreateEmployeeResponse.class);
        return response;
    }

    @Override
    public List<GetAllEmployeeResponse> getAllEmployee() {
        List<Employee> employees =employeeRepository.findAll();
        List<GetAllEmployeeResponse> employeeResponse =employees.stream().map(employee -> mapperService.forResponse().map(employee, GetAllEmployeeResponse.class))
                .collect(Collectors.toList());
        return employeeResponses;
    }



    @Override
    public GetEmployeeResponse getByPosition(String position) {
        Employee employee =employeeRepository.getByPosition(position);
        GetEmployeeResponse response = mapperService.forResponse().map(employee,GetEmployeeResponse.class);
        return response;
    }
}
