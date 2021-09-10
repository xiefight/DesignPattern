package com.xt.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-08 20:57
 **/
public class PythonVideo extends Video {
    /**
     * 创建视频
     */
    @Override
    public void produce() {
        System.out.println("python视频");
    }
}
