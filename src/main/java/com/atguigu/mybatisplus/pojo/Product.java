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
    private String email;
    private String git;
    private String git1;
    private String git3;
    private String git2;
    private String git5;private String git6;private String git7;//
    int[] array= new int[]{1,2,3};
    int[] array1 = {1,2,3 };
    int[] array2 = {1,2,3 };
    int[] array3 = {1,2,3 };
     int[] array4 = {1,2,3 };
    int[] array5 = {1,2,3 };
    int[] array6 = {1, 2, 3};
    int[] array7 = {1, 2, 3};
    int[] array8 = {1, 2, 3};
    int[] array9 = {1, 2, 3}; //远程库修改
}
