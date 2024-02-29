package com.tobeto.bootcampProject.business.concretes;

import com.tobeto.bootcampProject.business.abstracts.ApplicantService;
import com.tobeto.bootcampProject.business.response.create.CreateApplicantResponse;
import com.tobeto.bootcampProject.business.response.get. applicant.GetAllApplicantResponse;
import com.tobeto.bootcampProject.business.response.get.applicant.GetApplicantResponse;
import com.tobeto.bootcampProject.core.utilities.mapping.ModelMapperService;
import com.tobeto.bootcampProject.dataAccess.abstracts.ApplicantRepository;
import com.tobeto.bootcampProject.dataAccess.abstracts.EmployeeRepository;
import com.tobeto.bootcampProject.entities.concretes.Applicant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ApplicantManager implements ApplicantService {
    private ApplicantRepository  applicantRepository;
    private ModelMapperService mapperService;

    @Override
    public CreateApplicantResponse add(CreateApplicantRequest request) {
        Applicant applicant =mapperService.forRequest().map(request,Applicant.class);
        applicant.setAbout(request.getAbout());
        applicantRepository.save(applicant);
        CreateApplicantResponse response =mapperService.forResponse().map(applicant,CreateApplicantResponse.class);
        return response;
    }



    @Override
    public List<GetAllApplicantResponse> getAllApplicant() {
        List<Applicant> applicants=applicantRepository.findAll();
        List<GetAllApplicantResponse> applicantResponses = applicants.stream().map(applicant ->
                        mapperService.forResponse().map(applicant,GetAllApplicantResponse.class))
                .collect(Collectors.toList());
        return applicantResponses;
    }

    @Override
    public GetApplicantResponse getByAbout(String about) {
        Applicant applicant =applicantRepository.getByAbout(about);
        GetApplicantResponse response =
                mapperService.forResponse().map(applicant,GetApplicantResponse.class);

        return response;
    }



}