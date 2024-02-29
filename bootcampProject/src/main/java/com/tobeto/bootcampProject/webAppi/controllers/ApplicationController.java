package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.ApplicationService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.applicant.GetApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetAllApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetApplicationResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/application")
@AllArgsConstructor
public class ApplicationController {
    private ApplicationService applicationService;

    @PostMapping()
    public CreateApplicationResponse add(@RequestBody CreateApplicationRequest request) {
        CreateApplicationResponse result = applicationService.add(request);
        return result;

    }

    @GetMapping("getall")
    public List<GetAllApplicationResponse> getAll() {
        return applicationService.getAllApplication();
    }

    @GetMapping("getbyId/{id}")
    public GetApplicationResponse getById(@PathVariable int id) {
        return applicationService.getById(id);
    }
}
