package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.ApplicationService;
import com.tobeto.bootcampProject.business.abstracts.ApplicationStateService;
import com.tobeto.bootcampProject.business.abstracts.UserService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationRequest;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationStateRequest;
import com.tobeto.bootcampProject.business.request.create.CreateUserRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationResponse;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.create.CreateUserResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetAllApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetAllApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetAllUserResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/applicationState")
@AllArgsConstructor
public class ApplicationStateController {
    private ApplicationStateService applicationStateService;

    @PostMapping()
    public CreateApplicationStateResponse add(@RequestBody CreateApplicationStateRequest request) {
        CreateApplicationStateResponse result = applicationStateService.add(request);
        return result;

    }

    @GetMapping("getall")
    public List<GetAllApplicationStateResponse> getAll() {
        return applicationStateService.getAllApplicationState();
    }

    @GetMapping("getbyId/{id}")
    public GetApplicationStateResponse getById(@PathVariable int id) {
        return applicationStateService.getById(id);
    }
}