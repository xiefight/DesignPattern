package com.xt.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-08 20:56
 **/
public class JavaArticle extends Article{
    @Override
    public void produce() {
        System.out.println("java手记");
    }
}
