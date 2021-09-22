package com.xt.design.pattern.creational.builder;

import java.math.BigDecimal;

/**
 * @Description: 德尔地板
 * @Author: xietao
 * @Date: 2021-09-22 19:48
 **/
public class DerFloor implements Matter {
    @Override
    public String scene() {
        return "地板";
    }

    @Override
    public String brand() {
        return "德尔";
    }

    @Override
    public String model() {
        return "A+";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(119);
    }

    @Override
    public String desc() {
        return "DER德尔集团是全球领先的专业⽊木地板制造商，北北京2008年年奥运会家装和公装\n" +
                "地板供应商";
    }
}
