package com.company.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@Table(name = "course")
public class CourseEntity extends BaseEntity{

    @Column
    private String name;
}
