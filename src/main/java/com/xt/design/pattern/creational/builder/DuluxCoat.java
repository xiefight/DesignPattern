package com.xt.design.pattern.creational.builder;

import java.math.BigDecimal;

/**
 * @Description: 多乐士涂料
 * @Author: xietao
 * @Date: 2021-09-22 19:48
 **/
public class DuluxCoat implements Matter {
    @Override
    public String scene() {
        return "涂料";
    }

    @Override
    public String brand() {
        return "多乐士";
    }

    @Override
    public String model() {
        return "第二代";
    }

    @Override
    public BigDecimal price() {
        return new BigDecimal(179);
    }

    @Override
    public String desc() {
        return "多乐⼠士是阿克苏诺⻉贝尔旗下的著名建筑装饰油漆品牌，产品畅销于全球100个国\n" +
                "家，每年年全球有5000万户家庭使⽤用多乐⼠士油漆。";
    }
}
