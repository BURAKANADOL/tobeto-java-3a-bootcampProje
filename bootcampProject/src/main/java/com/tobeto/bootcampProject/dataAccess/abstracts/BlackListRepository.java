package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.ApplicationState;
import com.tobeto.bootcampProject.entities.concretes.BlackList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BlackListRepository extends JpaRepository<BlackList,Integer> {
    BlackList getById(int id);
    BlackList  getByDate (String date);
}
