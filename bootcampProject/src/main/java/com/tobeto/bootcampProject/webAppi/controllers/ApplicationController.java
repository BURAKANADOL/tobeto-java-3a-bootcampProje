package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.ApplicationService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateApplicationRequest;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/applications")
@AllArgsConstructor
public class ApplicationController extends BaseController {

    private ApplicationService applicationService;

    @PostMapping
    public ResponseEntity<?> add(@RequestBody CreateApplicationRequest request) {
        return handleDataResult(applicationService.add(request));
    }

    @GetMapping("getAll")
    public ResponseEntity<?> getAll() {
        return handleDataResult(applicationService.getAll());
    }

    @GetMapping("getById/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) {
        return handleDataResult(applicationService.getById(id));
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        return handleResult(applicationService.delete(id));
    }

    @PutMapping("update")
    public ResponseEntity<?> update(@RequestBody UpdateApplicationRequest request) {
        return handleDataResult(applicationService.update(request));
    }

    @GetMapping("sort")
    public ResponseEntity<?> getAllPage(@RequestBody PageDto pageDto){
        return handleDataResult(applicationService.getAllPage(pageDto));
    }
}