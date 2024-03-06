package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateApplicationRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateApplicationRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetAllApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetApplicationResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateApplicationResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface ApplicationService {
    DataResult<CreateApplicationResponse> add(CreateApplicationRequest request);

    DataResult<List<GetAllApplicationResponse>> getAll();

    DataResult<GetApplicationResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateApplicationResponse> update(UpdateApplicationRequest request);

    DataResult<List<GetAllApplicationResponse>> getAllPage(PageDto pageDto);
}
