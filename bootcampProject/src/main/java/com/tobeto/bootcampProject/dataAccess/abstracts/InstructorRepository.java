package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.Instructor;
import com.tobeto.bootcampProject.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InstructorRepository extends JpaRepository<Instructor,Integer> {
    Instructor  getByCompanyName(String companyName);
    List <Instructor> findByNameIgnoreCase(String name);


}
