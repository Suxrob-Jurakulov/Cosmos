package com.company.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@Table(name = "lesson")
public class LessonEntity extends BaseEntity{

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(name = "course_id")
    private Integer courseId;
    @JoinColumn(name = "course_id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private CourseEntity course;

    @Column(name = "attach_id")
    private Integer attachId;
    @JoinColumn(name = "attach_id", insertable = false, updatable = false)
    @ManyToOne(fetch = FetchType.LAZY)
    private AttachEntity attach;


}
