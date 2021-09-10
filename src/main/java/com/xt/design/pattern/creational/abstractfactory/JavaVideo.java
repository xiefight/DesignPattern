package com.xt.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-08 20:55
 **/
public class JavaVideo extends Video{
    @Override
    public void produce() {
        System.out.println("录制java");
    }
}
