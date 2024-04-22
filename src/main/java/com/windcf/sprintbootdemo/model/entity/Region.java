package com.windcf.sprintbootdemo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "region")
public class Region {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 10)
    @Column(name = "code", length = 10)
    private String code;

    @Column(name = "parent_code")
    private Long parentCode;

    @Size(max = 20)
    @Column(name = "name", length = 20)
    private String name;

    @Column(name = "level")
    private Integer level;

    @NotNull
    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @NotNull
    @Column(name = "update_time", nullable = false)
    private Instant updateTime;

    @NotNull
    @Column(name = "is_deleted", nullable = false)
    private Byte isDeleted;

}