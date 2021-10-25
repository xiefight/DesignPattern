package com.xt.design.pattern.structural.decorator.v1;

/**
 * @Description: 煎饼+鸡蛋
 * @Author: xietao
 * @Date: 2021-10-18 20:01
 **/
public class BattercakeWithEgg extends Battercake {

    @Override
    protected String name() {
        return super.name() + " 加个蛋";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }
}
