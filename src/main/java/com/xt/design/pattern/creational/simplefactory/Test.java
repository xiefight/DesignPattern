package com.xt.design.pattern.creational.simplefactory;

/**
 * @Description: jdk的Calendar使用了简单工厂模式
 * @Author: xietao
 * @Date: 2021-09-06 21:24
 **/
public class Test {

    public static void main(String[] args) {
        Video video = VideoFactory.createVideo("java");
        video.produce();

        Video video2 = VideoFactory.createVideo2(JavaVideo.class);
        video2.produce();
    }

}
