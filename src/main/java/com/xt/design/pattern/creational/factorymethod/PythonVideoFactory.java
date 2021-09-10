package com.xt.design.pattern.creational.factorymethod;

/**
 * @Description: python视频工厂
 * @Author: xietao
 * @Date: 2021-09-08 19:27
 **/
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
