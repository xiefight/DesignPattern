package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 测试
 * @Author: xietao
 * @Date: 2021-09-25 14:22
 **/
public class Test {

    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());

        t1.start();
        t2.start();

        System.out.println("program end");

    }

}
