package com.tobeto.bootcampProject.business.rules;


import com.tobeto.bootcampProject.core.exception.types.BusinessException;
import com.tobeto.bootcampProject.dataAccess.abstracts.BootcampRepository;
import com.tobeto.bootcampProject.entities.concretes.Bootcamp;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BootcampBusinessRules {
    private BootcampRepository bootcampRepository;

    public void checkIfInstructorHasBootcamp(int id) {
        List<Bootcamp> bootcamp = bootcampRepository.getAllByInstructorId(id);
        if (!bootcamp.isEmpty()) {
            throw new BusinessException("This instructor has bootcamp(s) and can not be deleted!");
        }
    }

    public void checkIfBootcampStateInUse(int id) {
        List<Bootcamp> bootcamp = bootcampRepository.getAllByBootcampStateId(id);
        if (!bootcamp.isEmpty()) {
            throw new BusinessException("This bootcamp state has bootcamp(s) and can not be deleted!");
        }
    }
}