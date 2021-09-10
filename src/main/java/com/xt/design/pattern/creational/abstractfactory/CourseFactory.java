package com.xt.design.pattern.creational.abstractfactory;

/**
 * @Description: 课程工厂  视频+手记=一个课程
 * @Author: xietao
 * @Date: 2021-09-08 20:51
 **/
public interface CourseFactory {

    Video getVideo();

    Article getArticle();

}
