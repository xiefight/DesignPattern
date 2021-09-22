package com.xt.design.pattern.creational.builder;

import java.math.BigDecimal;

/**
 * @Description: 一级顶
 * @Author: xietao
 * @Date: 2021-09-22 19:48
 **/
public class LevelOneCeiling implements Matter {
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
        return "一级顶";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(260);
    }

    @Override
    public String desc() {
        return "造型制作低一级，只有一个层次的吊顶，一般离顶120-150mm";
    }
}
