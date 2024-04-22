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

@Getter
@Setter
@Entity
@Table(name = "order_info")
public class OrderInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @NotNull
    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Size(max = 200)
    @Column(name = "nick_name", length = 200)
    private String nickName;

    @Size(max = 64)
    @NotNull
    @Column(name = "order_no", nullable = false, length = 64)
    private String orderNo;

    @Column(name = "coupon_id")
    private Long couponId;

    @NotNull
    @Column(name = "total_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @NotNull
    @Column(name = "coupon_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal couponAmount;

    @NotNull
    @Column(name = "original_total_amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal originalTotalAmount;

    @NotNull
    @Column(name = "feight_fee", nullable = false, precision = 10, scale = 2)
    private BigDecimal feightFee;

    @Column(name = "pay_type")
    private Byte payType;

    @NotNull
    @Column(name = "order_status", nullable = false)
    private Byte orderStatus;

    @Size(max = 100)
    @Column(name = "receiver_name", length = 100)
    private String receiverName;

    @Size(max = 32)
    @Column(name = "receiver_phone", length = 32)
    private String receiverPhone;

    @Size(max = 32)
    @Column(name = "receiver_tag_name", length = 32)
    private String receiverTagName;

    @Column(name = "receiver_province")
    private Long receiverProvince;

    @Column(name = "receiver_city")
    private Long receiverCity;

    @Column(name = "receiver_district")
    private Long receiverDistrict;

    @Size(max = 200)
    @Column(name = "receiver_address", length = 200)
    private String receiverAddress;

    @Column(name = "payment_time")
    private Instant paymentTime;

    @Column(name = "delivery_time")
    private Instant deliveryTime;

    @Column(name = "receive_time")
    private Instant receiveTime;

    @Size(max = 500)
    @Column(name = "remark", length = 500)
    private String remark;

    @Column(name = "cancel_time")
    private Instant cancelTime;

    @Size(max = 255)
    @Column(name = "cancel_reason")
    private String cancelReason;

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