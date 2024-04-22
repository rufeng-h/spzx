package com.windcf.sprintbootdemo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "coupon_info")
public class CouponInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "coupon_type", nullable = false)
    private Byte couponType;

    @Size(max = 100)
    @Column(name = "coupon_name", length = 100)
    private String couponName;

    @NotNull
    @Column(name = "amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @NotNull
    @Column(name = "condition_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal conditionAmount;

    @Column(name = "start_time")
    private LocalDate startTime;

    @Column(name = "end_time")
    private LocalDate endTime;

    @NotNull
    @Column(name = "range_type", nullable = false)
    private Byte rangeType;

    @Size(max = 200)
    @Column(name = "range_desc", length = 200)
    private String rangeDesc;

    @NotNull
    @Column(name = "publish_count", nullable = false)
    private Integer publishCount;

    @NotNull
    @Column(name = "per_limit", nullable = false)
    private Integer perLimit;

    @NotNull
    @Column(name = "use_count", nullable = false)
    private Integer useCount;

    @NotNull
    @Column(name = "receive_count", nullable = false)
    private Integer receiveCount;

    @Column(name = "expire_time")
    private Instant expireTime;

    @Column(name = "publish_status")
    private Boolean publishStatus;

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