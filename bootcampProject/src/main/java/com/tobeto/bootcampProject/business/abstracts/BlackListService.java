package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateBlackListRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBlackListResponse;
import com.tobeto.bootcampProject.business.response.get.blackList.GetAllBlackListResponse;
import com.tobeto.bootcampProject.business.response.get.blackList.GetBlackListResponse;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;


import java.util.List;

public interface BlackListService {
    DataResult<CreateBlackListResponse> add(CreateBlackListRequest request);
    List<GetAllBlackListResponse> getAllBlackList();

    GetBlackListResponse getByDate(String date);
}