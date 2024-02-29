package com.tobeto.bootcampProject.entities.concretes;

import com.tobeto.bootcampProject.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "instructors")
@EqualsAndHashCode(callSuper = true)
public class BlackList extends BaseEntity<Integer> {
    @Column(name = "reason")
    private String reason;
    @Column(name = "date")
    private  String date;
    @OneToOne
    @JoinColumn(name = "applicantId")
    private Applicant applicant;

}