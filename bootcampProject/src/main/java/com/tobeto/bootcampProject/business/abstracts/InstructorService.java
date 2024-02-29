package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateInstructorRequest;
import com.tobeto.bootcampProject.business.response.create.CreateInstructorResponse;
import com.tobeto.bootcampProject.business.response.get.instructor.GetAllInstructorResponse;
import com.tobeto.bootcampProject.business.response.get.instructor.GetInstructorResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;

import java.util.List;

public interface InstructorService {
    CreateInstructorResponse add(CreateInstructorRequest request);
    List<GetAllInstructorResponse> getAllInstructor();

    GetInstructorResponse getByCompanyName(String companyName);

    DataResult<List <GetAllInstructorResponse>> getAllPage(PageDto pageDto);


}