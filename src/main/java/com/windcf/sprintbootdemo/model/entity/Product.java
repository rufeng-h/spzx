package com.windcf.sprintbootdemo.model.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 255)
    @Column(name = "name")
    private String name;

    @Column(name = "brand_id")
    private Long brandId;

    @Column(name = "category1_id")
    private Long category1Id;

    @Column(name = "category2_id")
    private Long category2Id;

    @Column(name = "category3_id")
    private Long category3Id;

    @Size(max = 50)
    @Column(name = "unit_name", length = 50)
    private String unitName;

    @Lob
    @Column(name = "slider_urls")
    private String sliderUrls;

    @Size(max = 255)
    @Column(name = "spec_value")
    private String specValue;

    @NotNull
    @Column(name = "status", nullable = false)
    private Byte status;

    @NotNull
    @Column(name = "audit_status", nullable = false)
    private Byte auditStatus;

    @Size(max = 255)
    @Column(name = "audit_message")
    private String auditMessage;

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