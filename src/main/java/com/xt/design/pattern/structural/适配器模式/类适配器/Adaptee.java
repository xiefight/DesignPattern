package com.xt.design.pattern.structural.适配器模式.类适配器;

/**
 * @Description: 被适配者
 * @Author: xietao
 * @Date: 2021-10-27 21:20
 **/
public class Adaptee {

    /**
     * 方法被适配者独有
     */
    public void adapteeRequest(){
        System.out.println("被适配者的方法");
    }

}
