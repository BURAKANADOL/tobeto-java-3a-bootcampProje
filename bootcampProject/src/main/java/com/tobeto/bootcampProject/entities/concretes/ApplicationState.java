package com.tobeto.bootcampProject.entities.concretes;

import com.tobeto.bootcampProject.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applicationsStates")
@EqualsAndHashCode
public class ApplicationState extends BaseEntity<Integer> {

    @Column(name = "name")
    private  String name;

    @OneToMany(mappedBy = "applicationState")
    private List<Application> applications;

}