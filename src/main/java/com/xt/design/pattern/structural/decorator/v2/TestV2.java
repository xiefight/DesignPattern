package com.xt.design.pattern.structural.decorator.v2;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-10-18 20:17
 **/
public class TestV2 {

    public static void main(String[] args) {

        ABattercake aBattercake;
        //先做个煎饼
        aBattercake = new Battercake();
        //煎饼上加个蛋
        aBattercake = new EggDecorator(aBattercake);
        //煎饼上加根肠
        aBattercake = new SausageDecorator(aBattercake);
        //再来根肠
        aBattercake = new SausageDecorator(aBattercake);
        //够了，输出
        System.out.println(aBattercake.name() + " 消费 " + aBattercake.cost());

    }

}
