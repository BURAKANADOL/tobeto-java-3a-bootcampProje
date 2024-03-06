package com.tobeto.bootcampProject.business.abstracts;

import com.tobeto.bootcampProject.business.request.create.CreateBlackListRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBlackListRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBlackListResponse;
import com.tobeto.bootcampProject.business.response.get.blackList.GetAllBlackListResponse;
import com.tobeto.bootcampProject.business.response.get.blackList.GetBlackListResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateBlackListResponse;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;

import java.util.List;

public interface BlackListService {
    DataResult<CreateBlackListResponse> add(CreateBlackListRequest request);

    DataResult<List<GetAllBlackListResponse>> getAll();

    DataResult<GetBlackListResponse> getById(int id);

    Result delete(int id);

    DataResult<UpdateBlackListResponse> update(UpdateBlackListRequest request);

    DataResult<List<GetAllBlackListResponse>> getAllPage(PageDto pageDto);

    List<GetAllBlackListResponse> getAllBlackList();
}