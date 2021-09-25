package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 懒汉式单例及双重检查锁
 * @Author: xietao
 * @Date: 2021-09-25 14:21
 **/
public class LazySingletonDoubleCheckSync {

    private volatile static LazySingletonDoubleCheckSync lazySingleton;

    private LazySingletonDoubleCheckSync(){}

    public static LazySingletonDoubleCheckSync getInstance(){
        if (lazySingleton == null){
            synchronized (LazySingletonDoubleCheckSync.class){
                if (lazySingleton == null){
                    lazySingleton = new LazySingletonDoubleCheckSync();
                }
            }
        }
        return lazySingleton;
    }

}
