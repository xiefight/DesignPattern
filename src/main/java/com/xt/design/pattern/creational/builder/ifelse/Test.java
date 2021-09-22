package com.xt.design.pattern.creational.builder.ifelse;

import java.math.BigDecimal;

/**
 * @Description: test
 * @Author: xietao
 * @Date: 2021-09-22 20:08
 **/
public class Test {

    public static void main(String[] args) {
        DecorationPackageController decoration = new
                DecorationPackageController();
        // 豪华欧式
        System.out.println(decoration.getMatterList(new
                BigDecimal("132.52"), 1));
        // 轻奢⽥田园
        System.out.println(decoration.getMatterList(new
                BigDecimal("98.25"), 2));
        // 现代简约
        System.out.println(decoration.getMatterList(new
                BigDecimal("85.43"), 3));
    }

}
