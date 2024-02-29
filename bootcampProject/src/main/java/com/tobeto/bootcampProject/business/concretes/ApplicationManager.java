package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.ApplicationService;
import com.tobeto.bootcampProject.business.request.create.CreateApplicationRequest;
import com.tobeto.bootcampProject.business.response.create.CreateApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetAllApplicationResponse;
import com.tobeto.bootcampProject.business.response.get.application.GetApplicationResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.dataAccess.abstracts.ApplicationRepository;
import com.tobeto.bootcampProject.entities.concretes.Application;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
@AllArgsConstructor
public class ApplicationManager implements ApplicationService {
    private ApplicationRepository applicationRepository;
    private ModelMapperService mapperService;

    @Override
    public CreateApplicationResponse add(CreateApplicationRequest request) {
        Application application = mapperService.forRequest().map(request, Application.class);
        application.setId(request.getId());
        applicationRepository.save(application);
        CreateApplicationResponse response = mapperService.forResponse().map(application, CreateApplicationResponse.class);
        return response;
    }

    @Override
    public List<GetAllApplicationResponse> getAllApplication() {
        List<Application> applications = applicationRepository.findAll();
        List<GetAllApplicationResponse> ApplicationResponses = applications.stream().map(application ->
                        mapperService.forResponse().map(application, GetAllApplicationResponse.class))
                .collect(Collectors.toList());


        return applicationResponse;
    }

    @Override
    public GetApplicationResponse getById(int id) {
        Application application = applicationRepository.getById(id);
        GetApplicationResponse response = mapperService.forResponse().map(application, GetApplicationResponse.class);
        return response;
    }
}