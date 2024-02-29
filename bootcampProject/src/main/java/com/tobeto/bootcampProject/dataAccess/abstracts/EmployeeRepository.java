package com.tobeto.bootcampProject.dataAccess.abstracts;

import com.tobeto.bootcampProject.entities.concretes.Employee;
import com.tobeto.bootcampProject.entities.concretes.Instructor;
import com.tobeto.bootcampProject.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {

    Employee getByPosition(String position);
}