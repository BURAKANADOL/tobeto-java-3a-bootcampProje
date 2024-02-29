package com.tobeto.bootcampProject.entities.concretes;

import com.tobeto.bootcampProject.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applications")

public class Application extends BaseEntity<Integer> {

    @ManyToOne
    @JoinColumn(name = "applicantId")
    private User applicant;
    @ManyToOne
    @JoinColumn(name = "applicationStateId")
    private ApplicationState applicationState;

    @ManyToOne
    @JoinColumn(name = "bootcampId")
    private Bootcamp bootcamp;


}
