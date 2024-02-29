package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateApplicationStateRequest;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetAllApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetAllBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;

import java.util.List;

public interface BootcampService {
    CreateBootcampResponse add(CreateBootcampRequest request);
    List<GetAllBootcampResponse> getAllBootcamp();
    GetBootcampResponse  getById(int id);
}
