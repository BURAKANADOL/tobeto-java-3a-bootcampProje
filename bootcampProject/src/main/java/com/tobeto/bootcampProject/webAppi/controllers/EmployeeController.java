package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.request.create.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.response.create.CreateEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetAllEmployeeResponse;
import com.tobeto.bootcampProject.business.response.get.employee.GetEmployeeResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employee")
@AllArgsConstructor
public class EmployeeController {
    private EmployeeService employeeService;

    @PostMapping()
    public CreateEmployeeResponse add(@RequestBody CreateEmployeeRequest request){
        CreateEmployeeResponse result =employeeService.add(request);
        return  result;

    }
    @GetMapping("getallemployee")
    public List<GetAllEmployeeResponse> getAllEmployee(){
        return employeeService.getAllEmployee();
    }

    @GetMapping("getbyPosition/{position}")
    public GetEmployeeResponse  getByPosition(@PathVariable String position){
        return employeeService.getByPosition(position);
    }


}