package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 新线程执行懒汉式单例模式
 * @Author: xietao
 * @Date: 2021-09-25 14:22
 **/
public class T implements Runnable{

    @Override
    public void run() {
//        LazySingleton l = LazySingleton.getInstance();
        LazySingletonSync l = LazySingletonSync.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + l);
    }
}
