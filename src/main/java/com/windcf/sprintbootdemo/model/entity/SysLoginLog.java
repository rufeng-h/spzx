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
@Table(name = "sys_login_log")
public class SysLoginLog {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 50)
    @Column(name = "username", length = 50)
    private String username;

    @Size(max = 128)
    @Column(name = "ipaddr", length = 128)
    private String ipaddr;

    @Column(name = "status")
    private Boolean status;

    @Size(max = 255)
    @Column(name = "msg")
    private String msg;

    @Column(name = "access_time")
    private Instant accessTime;

    @NotNull
    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @NotNull
    @Column(name = "is_deleted", nullable = false)
    private Byte isDeleted;

}