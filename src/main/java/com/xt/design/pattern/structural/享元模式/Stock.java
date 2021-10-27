package com.xt.design.pattern.structural.享元模式;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description: 库存
 * @Author: xietao
 * @Date: 2021-10-26 13:51
 **/
@Data
@AllArgsConstructor
public class Stock {

    private int total; // 库存总量
    private int used; // 库存已用

}
