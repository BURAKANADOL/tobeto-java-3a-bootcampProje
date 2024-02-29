package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.ApplicationStateService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetAllApplicationStateResponse;
import com.tobeto.bootcampProject.business.response.get.applicationState.GetApplicationStateResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.dataAccess.abstracts.ApplicationStateRepository;
import com.tobeto.bootcampProject.entities.concretes.ApplicationState;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor
public class ApplicationStateManager implements ApplicationStateService {
    private ApplicationStateRepository applicationStateRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateApplicationStateResponse add(CreateApplicationStateRequest request) {
        ApplicationState applicationState =mapperService.forRequest().map(request,ApplicationState.class);
        //applicationState.setId(request.getId());
        applicationStateRepository.save(applicationState);
        CreateApplicationStateResponse response =mapperService.forResponse().map(applicationState,CreateApplicationStateResponse.class);
        return response;
    }

    @Override
    public List<GetAllApplicationStateResponse> getAllApplicationState() {
        List<ApplicationState>applicationStates=applicationStateRepository.findAll();

        List<GetAllApplicationStateResponse>applicationStateResponses= applicationStates.stream().map(applicationState ->
                        mapperService.forResponse().map(applicationState, GetAllApplicationStateResponse.class))
                .collect(Collectors.toList());


        return applicationStateResponses;
    }

    @Override
    public GetApplicationStateResponse getById(int id) {
        ApplicationState applicationState =applicationStateRepository.getById(id);
        GetApplicationStateResponse response=  mapperService.forResponse().map(applicationState,GetApplicationStateResponse.class);
        return response;
    }
}