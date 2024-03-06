package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.BlackListService;
import com.tobeto.bootcampProject.business.constants.BlackListMessage;
import com.tobeto.bootcampProject.business.request.create.CreateBlackListRequest;
import com.tobeto.bootcampProject.business.request.update.UpdateBlackListRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBlackListResponse;
import com.tobeto.bootcampProject.business.response.get.blackList.GetAllBlackListResponse;
import com.tobeto.bootcampProject.business.response.get.blackList.GetBlackListResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateBlackListResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;
import com.tobeto.bootcampProject.core.utilities.results.SuccessDataResult;
import com.tobeto.bootcampProject.dataAccess.abstracts.BlackListRepository;
import com.tobeto.bootcampProject.entities.concretes.BlackList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor

public class BlackListManager implements BlackListService {
    private BlackListRepository blackListRepository;
    private ModelMapperService mapperService;


    @Override
    public DataResult<CreateBlackListResponse> add(CreateBlackListRequest request) {
        BlackList blackList =mapperService.forRequest().map(request,BlackList.class);
        blackListRepository.save(blackList);
        CreateBlackListResponse response =mapperService.forResponse()
                .map(blackList,CreateBlackListResponse.class);
        return new
                SuccessDataResult<CreateBlackListResponse>
                (response, BlackListMessage.BlackListAdded);

    }

    @Override
    public DataResult<List<GetAllBlackListResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetBlackListResponse> getById(int id) {
        return null;
    }

    @Override
    public Result delete(int id) {
        return null;
    }

    @Override
    public DataResult<UpdateBlackListResponse> update(UpdateBlackListRequest request) {
        return null;
    }

    @Override
    public DataResult<List<GetAllBlackListResponse>> getAllPage(PageDto pageDto) {
        return null;
    }

    @Override
    public List<GetAllBlackListResponse> getAllBlackList() {
        List<BlackList> blackLists = blackListRepository.findAll();
        return blackLists.stream()
                .map(blackList -> mapperService.forResponse().map(blackList, GetAllBlackListResponse.class))
                .collect(Collectors.toList());
    }

    @Override
    public GetBlackListResponse getByDate(String date) {
        BlackList blackList=blackListRepository.getByDate(date);
        GetBlackListResponse response = mapperService.forResponse().map(blackList,GetBlackListResponse.class);

        return  response;
    }
}