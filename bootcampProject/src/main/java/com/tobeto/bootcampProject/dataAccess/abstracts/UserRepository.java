package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User getById(int id);

    User getByEmail(String email);

    User getByFirstName(String firstName);

    User getByLastName(String lastName);
}
