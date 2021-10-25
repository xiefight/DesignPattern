package com.xt.design.pattern.structural.decorator.v2;

/**
 * @Description: 实体煎饼
 * @Author: xietao
 * @Date: 2021-10-18 20:11
 **/
public class Battercake extends ABattercake{
    protected String name(){
        return "煎饼";
    }
    protected int cost(){
        return 8;
    }
}
