package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateBootcampStateRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBootcampStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetAllBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateBootcampStateResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface BootcampStateService {
    DataResult<CreateBootcampStateResponse> add(CreateBootcampStateRequest request);

    DataResult<List<GetAllBootcampStateResponse>> getAll();

    DataResult<GetBootcampStateResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateBootcampStateResponse> update(UpdateBootcampStateRequest request);

    DataResult<List<GetAllBootcampStateResponse>> getAllPage(PageDto pageDto);
}