package com.xt.design.pattern.creational.factorymethod;

/**
 * 具体工厂   相当于 ArrayList
 *
 * @Description: java视频工厂
 * @Author: xietao
 * @Date: 2021-09-08 19:26
 **/
public class JavaVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }
}
