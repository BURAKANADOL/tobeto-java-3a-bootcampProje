package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.Application;
import com.tobeto.bootcampProject.entities.concretes.Bootcamp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BootcampRepository extends JpaRepository<Bootcamp,Integer> {
    Bootcamp  getByName(String name);
    Bootcamp  getById(int id);
}
