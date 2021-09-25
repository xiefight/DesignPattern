package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 懒汉式单例及添加同步锁
 * @Author: xietao
 * @Date: 2021-09-25 14:21
 **/
public class LazySingletonSync {

    private static LazySingletonSync lazySingleton;

    private LazySingletonSync(){}

    public static LazySingletonSync getInstance(){
        synchronized (LazySingletonSync.class){
            if (lazySingleton == null){
                lazySingleton = new LazySingletonSync();
            }
        }
        return lazySingleton;
    }

}
