package com.xt.design.pattern.structural.decorator.v1;

/**
 * @Description: 煎饼+香肠
 * @Author: xietao
 * @Date: 2021-10-18 20:02
 **/
public class BattercakeWithSausage extends Battercake {

    @Override
    protected String name() {
        return super.name() + " 加根香肠";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}
