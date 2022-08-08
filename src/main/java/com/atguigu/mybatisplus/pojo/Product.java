package com.atguigu.mybatisplus.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * @author liwq
 * @create 2022-08-07 19:04
 */
@Data
@TableName("t_product")
public class Product {

    private Long id;
    private String name;
    private Integer price;
    private Integer version;
}