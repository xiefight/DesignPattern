package com.xt.design.pattern.structural.decorator.v2;

/**
 * @Description: 加蛋
 * @Author: xietao
 * @Date: 2021-10-18 20:15
 **/
public class EggDecorator extends Decorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String name() {
        return super.name() + " 加个蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
