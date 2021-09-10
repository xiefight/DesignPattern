package com.xt.design.pattern.creational.abstractfactory;

/**
 *
 * 对比于工厂方法：对于 Video Article  没有所谓的VideoFactory、ArticleFactory  只有一个CourseFactory包含了Video和Article
 *
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-08 20:59
 **/
public class PythonCourseFactory implements CourseFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }

    @Override
    public Article getArticle() {
        return new PythonArticle();
    }
}
