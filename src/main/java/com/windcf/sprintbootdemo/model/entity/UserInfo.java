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
@Table(name = "user_info")
public class UserInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 50)
    @Column(name = "username", length = 50)
    private String username;

    @Size(max = 500)
    @Column(name = "password", length = 500)
    private String password;

    @Size(max = 100)
    @Column(name = "nick_name", length = 100)
    private String nickName;

    @Size(max = 17)
    @Column(name = "phone", length = 17)
    private String phone;

    @Size(max = 200)
    @Column(name = "avatar", length = 200)
    private String avatar;

    @Column(name = "sex")
    private Boolean sex;

    @Size(max = 100)
    @Column(name = "memo", length = 100)
    private String memo;

    @Size(max = 45)
    @Column(name = "open_id", length = 45)
    private String openId;

    @Size(max = 45)
    @Column(name = "union_id", length = 45)
    private String unionId;

    @Size(max = 50)
    @Column(name = "last_login_ip", length = 50)
    private String lastLoginIp;

    @Column(name = "last_login_time")
    private Instant lastLoginTime;

    @Column(name = "status")
    private Byte status;

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