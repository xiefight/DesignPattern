package com.xt.design.pattern.structural.decorator.v2;

/**
 * @Description: 抽象装饰者
 * @Author: xietao
 * @Date: 2021-10-18 20:12
 **/
public class Decorator extends ABattercake{

    //注入抽象煎饼
    private ABattercake aBattercake;

    public Decorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }

    //在调用装饰者的方式时，是委托给了抽象煎饼
    @Override
    protected String name() {
        return aBattercake.name();
    }

    @Override
    protected int cost() {
        return aBattercake.cost();
    }
}
