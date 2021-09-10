package com.xt.design.pattern.creational.abstractfactory;

/**
 * @Description: Java
 * @Author: xietao
 * @Date: 2021-09-08 20:55
 **/
public class JavaCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new JavaVideo();
    }

    @Override
    public Article getArticle() {
        return new JavaArticle();
    }
}
