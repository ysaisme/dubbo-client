package com.ysa.model.entity.product;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "t_product_spu")
public class ProductSpuDO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 商品编码
     */
    private String spu;

    /**
     * 品牌
     */
    private String brand;

    /**
     * 名称
     */
    @Column(name = "product_name")
    private String productName;

    /**
     * 建议零售价
     */
    @Column(name = "suggest_price")
    private BigDecimal suggestPrice;

    /**
     * 会员价
     */
    @Column(name = "member_price")
    private BigDecimal memberPrice;

    /**
     * 库存
     */
    private Integer qty;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 创建人
     */
    @Column(name = "create_at")
    private Integer createAt;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 修改人
     */
    @Column(name = "update_at")
    private Integer updateAt;

    /**
     * 删除标识
     */
    @Column(name = "remove_flag")
    private Boolean removeFlag;
}