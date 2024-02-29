package com.tobeto.bootcampProject.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicantRepository extends JpaRepository<Applicant,Integer> {

    Applicant  getByAbout (String about);


}