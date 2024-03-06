package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateInstructorRequest;
import com.tobeto.bootcampProject.business.response.create.CreateInstructorResponse;
import com.tobeto.bootcampProject.business.response.get.instructor.GetAllInstructorResponse;
import com.tobeto.bootcampProject.business.response.get.instructor.GetInstructorResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateInstructorResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface InstructorService {
    DataResult<CreateInstructorResponse> add(CreateInstructorRequest request);

    DataResult<List<GetAllInstructorResponse>> getAll();

    DataResult<GetInstructorResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateInstructorResponse> update(UpdateInstructorRequest request);
    DataResult<List<GetAllInstructorResponse>> getAllPage(PageDto pageDto);
}