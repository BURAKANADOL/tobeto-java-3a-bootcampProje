package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateBootcampRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBootcampRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetAllBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetBootcampResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateBootcampResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface BootcampService {

    DataResult<CreateBootcampResponse> add(CreateBootcampRequest request);

    DataResult<List<GetAllBootcampResponse>> getAll();

    DataResult<GetBootcampResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateBootcampResponse> update(UpdateBootcampRequest request);

    DataResult<List<GetAllBootcampResponse>> getAllPage(PageDto pageDto);
}