package com.xt.design.pattern.creational.singleton;

/**
 * @Description: ThreadLocal线程单例
 * @Author: xietao
 * @Date: 2021-09-30 23:17
 **/
public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> t = new ThreadLocal<ThreadLocalSingleton>(){
        //重写初始化方法，在创建ThreadLocal时，往容器中放一个ThreadLocalSingleton对象
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    private ThreadLocalSingleton(){}

    //多个线程取的对象不是同一个，但是同一个线程多次调用，会返回同一个对象
    public static ThreadLocalSingleton getInstance(){
        return t.get();
    }

}
