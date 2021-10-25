package com.xt.design.pattern.structural.decorator.v2;

/**
 * @Description: 加肠
 * @Author: xietao
 * @Date: 2021-10-18 20:15
 **/
public class SausageDecorator extends Decorator {
    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected String name() {
        return super.name() + " 加根肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
