package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateApplicationRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetAllApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetApplicationResponse;

import java.util.List;

public interface ApplicationService {
    CreateApplicationResponse  add(CreateApplicationRequest request);
    List<GetAllApplicationResponse> getAllApplication();
    GetApplicationResponse getById(int id);

}
