package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateBootcampStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetAllBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetBootcampStateResponse;

import java.util.List;

public interface BootcampStateService {

    CreateBootcampStateResponse add(CreateBootcampStateRequest request);
    List<GetAllBootcampStateResponse> getAllBootcampState();
    GetBootcampStateResponse getById(int id);
}