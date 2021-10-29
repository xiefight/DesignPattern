package com.xt.design.pattern.structural.适配器模式.类适配器;

/**
 * @Description: 适配者   Adaptee和Adapter之间通过继承关联
 * 这是类适配器，主要是通过继承方式，通过适配器将逻辑适配成目标方法
 * @Author: xietao
 * @Date: 2021-10-27 21:24
 **/
public class Adapter extends Adaptee implements Target{

    /**
     * 通过适配者Adapter将父类Adaptee（被适配者）的adapteeRequest()方法适配到目标接口中
     */
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
