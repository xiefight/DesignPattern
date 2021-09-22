package com.xt.design.pattern.creational.abstractfactory;

/**
 *
 *
 * 如 sql 
 *
 * Java Python EF 属于产品族
 *
 * Video  Article 属于产品等级
 *
 * 抽象工厂在添加产品等级（比如添加备注时），要修改原代码
 * 所以在平时的工作中，要使用抽象工厂，场景：产品等级稳定，多个产品形成一个产品族的
 *
 *
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-08 21:06
 **/
public class Test {
    public static void main(String[] args) {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();

        video.produce();
        article.produce();
    }
}
