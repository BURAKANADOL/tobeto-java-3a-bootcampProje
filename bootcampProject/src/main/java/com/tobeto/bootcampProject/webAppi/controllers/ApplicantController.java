package com.tobeto.bootcampProject.webAppi.controllers;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.applicant.GetApplicantResponse;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/applicants")
@AllArgsConstructor
public class ApplicantController {
    private ApplicantService applicantService;

    @Autowired
    private ApplicantService  upplicantService;

    @PostMapping()
    public CreateApplicantResponse add(@RequestBody CreateApplicantRequest  request){
        CreateApplicantResponse  result =applicantService.add(request);
        return  result;
    }
    @GetMapping("getallapplicants")
    public List<GetAllApplicantResponse> getAllApplicant(){
        return applicantService.getAllApplicant();
    }

    @GetMapping("getByAbout/{about}")
    public GetApplicantResponse  getByAbout(@PathVariable String about){
        return applicantService.getByAbout(about);
    }




}