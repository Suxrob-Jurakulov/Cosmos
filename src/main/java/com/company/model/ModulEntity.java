package com.company.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "modul")
public class ModulEntity extends BaseEntity{

    @Column
    private String name;

    @Column
    private Double price;

    @Column(name = "course_id")
    private Integer courseId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id", updatable = false, insertable = false)
    private CourseEntity course;
}
