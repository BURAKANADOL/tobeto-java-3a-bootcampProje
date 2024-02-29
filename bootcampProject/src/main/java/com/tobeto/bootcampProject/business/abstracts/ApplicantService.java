package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.requests.create.applicant.CreateApplicantRequest;
import com.tobeto.bootcampProject.business.response.create.Applicant.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.Applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.Applicant.GetApplicantResponse;

import java.util.List;

public interface ApplicantService {
    CreateApplicantResponse  add(CreateApplicantRequest  request);
    List<GetAllApplicantResponse> getAllApplicant();
    GetApplicantResponse  getByAbout(String about);

}