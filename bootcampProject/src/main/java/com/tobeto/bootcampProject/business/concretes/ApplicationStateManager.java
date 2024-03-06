package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.ApplicationStateService;
import com.tobeto.bootcampProject.business.constants.ApplicationStateMessage;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationStateRequest;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetAllApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.update.UpdateApplicationStateResponse;
import com.tobeto.bootcampProject.business.rules.ApplicationBusinessRules;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.core.utilities.paging.PageDto;
import com.tobeto.bootcampProject.core.utilities.results.DataResult;
import com.tobeto.bootcampProject.core.utilities.results.Result;
import com.tobeto.bootcampProject.core.utilities.results.SuccessDataResult;
import com.tobeto.bootcampProject.core.utilities.results.SuccessResult;
import com.tobeto.bootcampProject.dataAccess.abstracts.ApplicationStateRepository;
import com.tobeto.bootcampProject.entities.concretes.ApplicationState;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ApplicationStateManager implements ApplicationStateService {

    private ApplicationStateRepository applicationStateRepository;
    private ModelMapperService mapperService;
    private ApplicationBusinessRules applicationBusinessRules;

    @Override
    public DataResult<CreateApplicationStateResponse> add(CreateApplicationStateRequest request) {

        ApplicationState applicationState = mapperService.forRequest().map(request, ApplicationState.class);
        applicationState.setCreatedDate(LocalDateTime.now());
        applicationStateRepository.save(applicationState);

        CreateApplicationStateResponse response = mapperService.forResponse()
                .map(applicationState, CreateApplicationStateResponse.class);

        return new SuccessDataResult<CreateApplicationStateResponse>
                (response, ApplicationStateMessage.ApplicationStateAdded);
    }

    @Override
    public DataResult<List<GetAllApplicationStateResponse>> getAll() {

        List<ApplicationState> applicationStates = applicationStateRepository.findAll();
        List<GetAllApplicationStateResponse> applicationStateResponses = applicationStates.stream()
                .map(applicationState -> mapperService.forResponse()
                        .map(applicationState, GetAllApplicationStateResponse.class)).toList();

        return new SuccessDataResult<List<GetAllApplicationStateResponse>>
                (applicationStateResponses, ApplicationStateMessage.AllApplicationStatesListed);
    }

    @Override
    public DataResult<GetApplicationStateResponse> getById(int id) {

        ApplicationState applicationState = applicationStateRepository.getById(id);
        GetApplicationStateResponse response = mapperService.forResponse()
                .map(applicationState, GetApplicationStateResponse.class);

        return new SuccessDataResult<GetApplicationStateResponse>
                (response, ApplicationStateMessage.ApplicationStateListed);
    }

    @Override
    public Result delete(int id) {

        ApplicationState applicationState = applicationStateRepository.getById(id);
        applicationBusinessRules.checkIfApplicationStateInUse(id);
        applicationStateRepository.delete(applicationState);

        return new SuccessResult(ApplicationStateMessage.ApplicationStateDeleted);
    }

    @Override
    public DataResult<UpdateApplicationStateResponse> update(UpdateApplicationStateRequest request) {

        ApplicationState applicationState = applicationStateRepository.getById(request.getId());
        ApplicationState updatedApplicationState = mapperService.forRequest().map(request, ApplicationState.class);

        applicationState.setName(updatedApplicationState.getName() != null ? updatedApplicationState.getName() : applicationState.getName());
        applicationState.setUpdatedDate(LocalDateTime.now());
        applicationStateRepository.save(applicationState);

        UpdateApplicationStateResponse response = mapperService.forResponse()
                .map(applicationState, UpdateApplicationStateResponse.class);

        return new SuccessDataResult<UpdateApplicationStateResponse>
                (response, ApplicationStateMessage.ApplicationStateUpdated);
    }

    @Override
    public DataResult<List<GetAllApplicationStateResponse>> getAllPage(PageDto pageDto) {

        Sort sort = Sort.by(Sort.Direction.fromString(pageDto.getSortDirection()), pageDto.getSortBy());
        Pageable pageable = PageRequest.of(pageDto.getPageNumber(), pageDto.getPageSize(), sort);
        Page<ApplicationState> applicationStates = applicationStateRepository.findAll(pageable);

        List<GetAllApplicationStateResponse> responses = applicationStates.stream()
                .map(applicationState -> mapperService.forResponse()
                        .map(applicationState, GetAllApplicationStateResponse.class)).toList();

        return new SuccessDataResult<List<GetAllApplicationStateResponse>>(responses);
    }
}