package com.tobeto.bootcampProject.business.rules;

import com.tobeto.bootcampProject.core.exception.types.BusinessException;
import com.tobeto.bootcampProject.dataAccess.abstracts.BlackListRepository;
import com.tobeto.bootcampProject.entities.concretes.BlackList;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class BlackListBusinessRules {

    private BlackListRepository blacklistRepository;

    public void checkIfApplicantInBlacklist(int id) {
        BlackList blacklist = blacklistRepository.getByApplicantId(id);
        if (blacklist != null) {
            throw new BusinessException("This applicant is already in blacklist!");
        }
    }
}