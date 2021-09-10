package com.xt.design.pattern.creational.factorymethod;

/**
 * 具体产品，相当于ArrayList中的Itr
 *
 *
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-06 21:23
 **/
public class JavaVideo extends Video {
    /**
     * 创建视频
     */
    @Override
    public void produce() {
        System.out.println("学习Java视频");
    }
}
