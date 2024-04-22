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
@Table(name = "sys_oper_log")
public class SysOperLog {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 50)
    @Column(name = "title", length = 50)
    private String title;

    @Size(max = 100)
    @Column(name = "method", length = 100)
    private String method;

    @Size(max = 10)
    @Column(name = "request_method", length = 10)
    private String requestMethod;

    @Size(max = 20)
    @Column(name = "operator_type", length = 20)
    private String operatorType;

    @Size(max = 50)
    @Column(name = "oper_name", length = 50)
    private String operName;

    @Size(max = 255)
    @Column(name = "oper_url")
    private String operUrl;

    @Size(max = 128)
    @Column(name = "oper_ip", length = 128)
    private String operIp;

    @Size(max = 2000)
    @Column(name = "oper_param", length = 2000)
    private String operParam;

    @Size(max = 2000)
    @Column(name = "json_result", length = 2000)
    private String jsonResult;

    @Column(name = "status")
    private Integer status;

    @Size(max = 2000)
    @Column(name = "error_msg", length = 2000)
    private String errorMsg;

    @NotNull
    @Column(name = "create_time", nullable = false)
    private Instant createTime;

    @Column(name = "update_time")
    private Instant updateTime;

    @NotNull
    @Column(name = "is_deleted", nullable = false)
    private Byte isDeleted;

}