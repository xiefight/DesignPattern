package com.xt.design.pattern.creational.builder;

import java.math.BigDecimal;

/**
 * @Description: 立邦涂料
 * @Author: xietao
 * @Date: 2021-09-22 19:48
 **/
public class LiBangCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "立邦";
    }

    @Override
    public String model() {
        return "默认级别";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(650);
    }

    @Override
    public String desc() {
        return "⽴立邦始终以开发绿⾊色产品、注重⾼高科技、⾼高品质为⽬目标，以技术⼒力力量量不不断推进科\n" +
                "研和开发，满⾜足消费者需求。";
    }
}
