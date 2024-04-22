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
@Table(name = "product_sku")
public class ProductSku {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Size(max = 30)
    @Column(name = "sku_code", length = 30)
    private String skuCode;

    @Size(max = 255)
    @Column(name = "sku_name")
    private String skuName;

    @Column(name = "product_id")
    private Long productId;

    @Size(max = 255)
    @Column(name = "thumb_img")
    private String thumbImg;

    @Column(name = "sale_price", precision = 10, scale = 2)
    private BigDecimal salePrice;

    @Column(name = "market_price", precision = 10, scale = 2)
    private BigDecimal marketPrice;

    @Column(name = "cost_price", precision = 10, scale = 2)
    private BigDecimal costPrice;

    @Column(name = "stock_num")
    private Integer stockNum;

    @NotNull
    @Column(name = "sale_num", nullable = false)
    private Integer saleNum;

    @Size(max = 255)
    @Column(name = "sku_spec")
    private String skuSpec;

    @Column(name = "weight", precision = 10, scale = 2)
    private BigDecimal weight;

    @Column(name = "volume", precision = 10, scale = 2)
    private BigDecimal volume;

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