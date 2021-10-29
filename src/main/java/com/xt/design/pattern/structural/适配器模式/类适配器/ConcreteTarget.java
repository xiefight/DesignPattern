package com.xt.design.pattern.structural.适配器模式.类适配器;

/**
 * @Description: 具体的直接实现
 * @Author: xietao
 * @Date: 2021-10-27 21:23
 **/
public class ConcreteTarget implements Target{
    @Override
    public void request() {
        System.out.println("ConcreteTarget的目标方法");
    }
}
