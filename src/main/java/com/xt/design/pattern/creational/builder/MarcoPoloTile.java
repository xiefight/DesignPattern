package com.xt.design.pattern.creational.builder;

import java.math.BigDecimal;

/**
 * @Description: 马可波罗地砖
 * @Author: xietao
 * @Date: 2021-09-22 19:48
 **/
public class MarcoPoloTile implements Matter {
    @Override
    public String scene() {
        return "地砖";
    }

    @Override
    public String brand() {
        return "马可波罗";
    }

    @Override
    public String model() {
        return "缺省";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(140);
    }

    @Override
    public String desc() {
        return "⻢马可波罗”品牌诞⽣生于1996年年，作为国内最早品牌化的建陶品牌，以“⽂文化陶\n" +
                "瓷”占领市场，享有“仿古砖⾄至尊”的美誉。";
    }
}
