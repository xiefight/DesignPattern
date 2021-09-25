package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 饿汉式单例
 * @Author: xietao
 * @Date: 2021-09-25 14:17
 **/
public class HungrySingleton {

    private HungrySingleton(){}

    private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();
    public static HungrySingleton getInstance(){
        return HUNGRY_SINGLETON;
    }

    //------------------静态代码块------------------
    private final static HungrySingleton HUNGRY_SINGLETON2;
    static {
        HUNGRY_SINGLETON2 = new HungrySingleton();
    }
    public static HungrySingleton getInstance2(){
        return HUNGRY_SINGLETON2;
    }

}
