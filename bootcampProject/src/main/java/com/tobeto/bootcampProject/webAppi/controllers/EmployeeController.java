package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.EmployeeService;
import com.tobeto.bootcampProject.business.request.create.CreateEmployeeRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateEmployeeRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/employees")
@AllArgsConstructor
public class EmployeeController extends BaseController {

    private EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody @Valid CreateEmployeeRequest request) {
        return handleDataResult(employeeService.add(request));
    }

    @GetMapping("getall")
    public ResponseEntity<?> getAll() {
        return handleDataResult(employeeService.getAll());
    }

    @GetMapping("getbyid/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(employeeService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(employeeService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody @Valid UpdateEmployeeRequest request) {
        return handleDataResult(employeeService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto) {
        return handleDataResult(employeeService.getAllPage(pageDto));
    }
}