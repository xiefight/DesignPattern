package com.xt.design.pattern.structural.decorator.v1;

/**
 * @Description: 这样的方式不灵活，要加两个蛋，三根肠，需要再写类，造成类爆炸
 * @Author: xietao
 * @Date: 2021-10-18 20:04
 **/
public class TestV1 {

    public static void main(String[] args) {

        //单要一个煎饼
        Battercake battercake = new Battercake();
        System.out.println(battercake.name() + " 消费 " + battercake.cost());

        //要一个煎饼+鸡蛋
        BattercakeWithEgg battercakeWithEgg = new BattercakeWithEgg();
        System.out.println(battercakeWithEgg.name() + " 消费 " + battercakeWithEgg.cost());

        //要一个煎饼+香肠
        BattercakeWithSausage battercakeWithSausage = new BattercakeWithSausage();
        System.out.println(battercakeWithSausage.name() + " 消费 " + battercakeWithSausage.cost());

    }

}
