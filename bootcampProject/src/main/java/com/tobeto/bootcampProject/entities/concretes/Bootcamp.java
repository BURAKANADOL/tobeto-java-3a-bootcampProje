package com.tobeto.bootcampProject.entities.concretes;

import com.tobeto.bootcampProject.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bootcamps")
public class Bootcamp extends BaseEntity<Integer> {

    @ManyToOne
    @JoinColumn(name = "instructorId")
    private User instructor;

    @ManyToOne
    @JoinColumn(name = "bootcampStateId")
    private BootcampState bootcampState;

    @Column(name = "name")
    private String name;

    @Column(name = "startDate")
    private  String startDate;
    @Column(name = "endDate")
    private String endDate;

    @OneToMany(mappedBy = "bootcamp")
    private List<Application> applications;

}