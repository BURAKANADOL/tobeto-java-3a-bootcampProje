package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateApplicationStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetAllApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetApplicationStateResponse;

import java.util.List;

public interface ApplicationStateService {
    CreateApplicationStateResponse add(CreateApplicationStateRequest request);
    List<GetAllApplicationStateResponse> getAllApplicationState();
    GetApplicationStateResponse getById(int id);
}
