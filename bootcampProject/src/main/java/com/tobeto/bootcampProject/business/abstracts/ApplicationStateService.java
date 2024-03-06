package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateApplicationStateRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateApplicationStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetAllApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateApplicationStateResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface ApplicationStateService {

    DataResult<CreateApplicationStateResponse> add(CreateApplicationStateRequest request);

    DataResult<List<GetAllApplicationStateResponse>> getAll();

    DataResult<GetApplicationStateResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateApplicationStateResponse> update(UpdateApplicationStateRequest request);

    DataResult<List<GetAllApplicationStateResponse>> getAllPage(PageDto pageDto);
}