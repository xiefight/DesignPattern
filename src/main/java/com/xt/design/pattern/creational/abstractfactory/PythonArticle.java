package com.xt.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-08 20:58
 **/
public class PythonArticle extends Article{
    @Override
    public void produce() {
        System.out.println("python手记");
    }
}
