package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 懒汉式单例及多线程debug调试
 * @Author: xietao
 * @Date: 2021-09-25 14:21
 **/
public class LazySingleton {

    private static LazySingleton lazySingleton;

    private LazySingleton(){}

    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
