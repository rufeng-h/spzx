package com.windcf.sprintbootdemo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "payment_info")
public class PaymentInfo {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "user_id")
    private Long userId;

    @Size(max = 50)
    @NotNull
    @Column(name = "order_no", nullable = false, length = 50)
    private String orderNo;

    @NotNull
    @Column(name = "pay_type", nullable = false)
    private Byte payType;

    @Size(max = 50)
    @Column(name = "out_trade_no", length = 50)
    private String outTradeNo;

    @Column(name = "amount", precision = 10, scale = 2)
    private BigDecimal amount;

    @Size(max = 200)
    @Column(name = "content", length = 200)
    private String content;

    @Size(max = 4)
    @Column(name = "payment_status", length = 4)
    private String paymentStatus;

    @Column(name = "callback_time")
    private Instant callbackTime;

    @Lob
    @Column(name = "callback_content")
    private String callbackContent;

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