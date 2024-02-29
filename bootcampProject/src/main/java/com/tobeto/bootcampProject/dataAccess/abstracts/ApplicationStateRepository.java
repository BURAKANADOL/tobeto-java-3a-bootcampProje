package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.Application;
import com.tobeto.bootcampProject.entities.concretes.ApplicationState;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ApplicationStateRepository extends JpaRepository<ApplicationState,Integer> {
    ApplicationState  getByName(String name);
    ApplicationState  getById(int id);
}