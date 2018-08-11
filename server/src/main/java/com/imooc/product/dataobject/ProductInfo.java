package com.imooc.product.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 如果这个类名和表名不一致可以加注解@Table(name="xxxx")
 * 目前这个类名和我表名一致所以不需要，它会自动映射
 */
@Data
@Entity
public class ProductInfo {
    @Id
    private String productId;
    private String productName;
    private BigDecimal productPrice;
    private Integer productStock;
    private String productDescription;
    private String productIcon;
    /**0 正常 1 下架*/
    private Integer productStatus;
    private Integer categoryType;
    private Date createTime;


}
