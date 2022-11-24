package com.company.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "attach")
public class AttachEntity extends BaseEntity {

    @Column
    private String extension;

    @Column(name = "new_name")
    private String newName;

    @Column(name = "original_name")
    private String originalName;

    @Column
    private Long size;

    @Column
    private Long duration;

    @Column
    private String path;

}
