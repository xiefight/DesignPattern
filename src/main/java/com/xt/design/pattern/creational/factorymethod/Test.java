package com.xt.design.pattern.creational.factorymethod;

/**
 *
 * Java Python EF 属于产品族
 *
 * 产品等级就一个  Video
 *
 * @Description: Collect 的 Iterator模式  LoggerFacotry  URLStreamHandler使用了工厂方法模式
 * @Author: xietao
 * @Date: 2021-09-06 21:24
 **/
public class Test {

    public static void main(String[] args) {
        VideoFactory videoFactory = new JavaVideoFactory();
        VideoFactory videoFactory2 = new PythonVideoFactory();
        Video video = videoFactory.getVideo();
        video.produce();

//        Video video2 = VideoFactory.createVideo2(JavaVideo.class);
//        video2.produce();
    }

}
