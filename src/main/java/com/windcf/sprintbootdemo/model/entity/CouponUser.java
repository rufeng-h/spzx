package com.windcf.sprintbootdemo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "coupon_user")
public class CouponUser {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "coupon_id")
    private Long couponId;

    @Column(name = "user_id")
    private Long userId;

    @Column(name = "order_id")
    private Long orderId;

    @Column(name = "coupon_status")
    private Byte couponStatus;

    @NotNull
    @Column(name = "get_type", nullable = false)
    private Byte getType;

    @Column(name = "get_time")
    private Instant getTime;

    @Column(name = "using_time")
    private Instant usingTime;

    @Column(name = "used_time")
    private Instant usedTime;

    @Column(name = "expire_time")
    private Instant expireTime;

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