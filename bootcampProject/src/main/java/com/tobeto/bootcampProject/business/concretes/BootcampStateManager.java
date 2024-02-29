package com.tobeto.bootcampProject.business.concretes;
import com.tobeto.bootcampProject.business.abstracts.BootcampStateService;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampStateRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampResponse;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetAllBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetAllBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetBootcampStateResponse;
import com.tobeto.bootcampProject.business.response.get.user.GetUserResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.dataAccess.abstracts.BootcampRepository;
import com.tobeto.bootcampProject.dataAccess.abstracts.BootcampStateRepository;
import com.tobeto.bootcampProject.entities.concretes.Bootcamp;
import com.tobeto.bootcampProject.entities.concretes.BootcampState;
import com.tobeto.bootcampProject.entities.concretes.User;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
@AllArgsConstructor

public class BootcampStateManager implements BootcampStateService {
    private BootcampStateRepository bootcampStateRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateBootcampStateResponse add(CreateBootcampStateRequest request) {

        BootcampState bootcampState =mapperService.forRequest().map(request,BootcampState.class);
        // bootcampState.setId(request.getId());
        bootcampStateRepository.save(bootcampState);
        CreateBootcampStateResponse response =mapperService.forResponse().map(bootcampState,CreateBootcampStateResponse.class);

        return response;
    }

    @Override
    public List<GetAllBootcampStateResponse> getAllBootcampState() {
        List<BootcampState> bootcampStates =bootcampStateRepository.findAll();
        List<GetAllBootcampStateResponse> bootcampStateResponses = bootcampStates.stream().map(bootcampState ->
                mapperService.forResponse().map(bootcampState, GetAllBootcampStateResponse.class)).collect(Collectors.toList());
        return bootcampStateResponses;
    }

    @Override
    public GetBootcampStateResponse getById(int id) {

        BootcampState bootcampState =bootcampStateRepository.getById(id);
        GetBootcampStateResponse response=  mapperService.forResponse().map(bootcampState,GetBootcampStateResponse.class);
        return response;
    }
}

