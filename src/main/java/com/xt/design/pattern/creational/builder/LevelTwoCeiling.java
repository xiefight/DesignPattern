package com.xt.design.pattern.creational.builder;

import java.math.BigDecimal;

/**
 * @Description: 二级顶
 * @Author: xietao
 * @Date: 2021-09-22 19:48
 **/
public class LevelTwoCeiling implements Matter {
    @Override
    public String scene() {
        return "吊顶";
    }

    @Override
    public String brand() {
        return "装修公司自带";
    }

    @Override
    public String model() {
        return "二级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(850);
    }

    @Override
    public String desc() {
        return "两个层次的吊顶，二级吊顶高度一般就往下吊20cm，要是层⾼很高，也可增加每级的厚度";
    }
}
