package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.BootcampService;
import com.tobeto.bootcampProject.business.request.create.CreateBootcampRequest;
import com.tobeto.bootcampProject.business.response.create.CreateBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetAllBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcamp.GetBootcampResponse;
import com.tobeto.bootcampProject.business.response.get.bootcampState.GetBootcampStateResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.dataAccess.abstracts.ApplicationStateRepository;
import com.tobeto.bootcampProject.dataAccess.abstracts.BootcampRepository;
import com.tobeto.bootcampProject.entities.concretes.Bootcamp;
import com.tobeto.bootcampProject.entities.concretes.BootcampState;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class BootcampManager implements BootcampService {
    private BootcampRepository  bootcampRepository;
    private ModelMapperService mapperService;
    @Override
    public CreateBootcampResponse add(CreateBootcampRequest request) {
        Bootcamp bootcamp =mapperService.forRequest().map(request,Bootcamp.class);
        bootcamp.setId(request.getId());
        bootcampRepository.save(bootcamp);
        CreateBootcampResponse response =mapperService.forResponse().map(bootcamp,CreateBootcampResponse.class);

        return response;
    }

    @Override
    public List<GetAllBootcampResponse> getAllBootcamp() {
        List<Bootcamp> bootcamps =bootcampRepository.findAll();
        List<GetAllBootcampResponse> bootcampResponses = bootcamps.stream().map(bootcamp ->
                mapperService.forResponse().map(bootcamp, GetAllBootcampResponse.class)).collect(Collectors.toList());
        return bootcampResponses;
    }

    @Override
    public GetBootcampResponse getById(int id) {
        Bootcamp bootcamp =bootcampRepository.getById(id);
        GetBootcampResponse response=  mapperService.forResponse().map(bootcamp,GetBootcampResponse.class);
        return response;
    }
}
