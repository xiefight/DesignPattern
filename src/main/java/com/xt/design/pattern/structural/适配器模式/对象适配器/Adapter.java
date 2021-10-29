package com.xt.design.pattern.structural.适配器模式.对象适配器;

/**
 * @Description: 适配者    Adaptee和Adapter之间通过组合关联
 * 这是对象适配器，和类适配器不同的是，不对Adaptee进行继承，而是组合注入的方式使用Adaptee
 * @Author: xietao
 * @Date: 2021-10-27 21:24
 **/
public class Adapter implements Target {

    Adaptee adaptee = new Adaptee();

    /**
     * 通过适配者Adapter将Adaptee（被适配者）的adapteeRequest()方法适配到目标接口中
     */
    @Override
    public void request() {
        //...
        adaptee.adapteeRequest();
        //...
    }
}
