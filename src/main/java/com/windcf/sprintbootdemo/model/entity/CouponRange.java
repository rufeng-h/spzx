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
@Table(name = "coupon_range")
public class CouponRange {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "coupon_id", nullable = false)
    private Long couponId;

    @NotNull
    @Column(name = "range_type", nullable = false)
    private Byte rangeType;

    @NotNull
    @Column(name = "range_id", nullable = false)
    private Long rangeId;

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