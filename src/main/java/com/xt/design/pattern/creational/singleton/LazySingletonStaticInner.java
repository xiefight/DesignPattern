package com.xt.design.pattern.creational.singleton;

/**
 * @Description: 懒汉式及静态内部类方式
 * @Author: xietao
 * @Date: 2021-09-25 14:54
 **/
public class LazySingletonStaticInner {

    private LazySingletonStaticInner(){

    }

    private static class InnerClass{
        private static LazySingletonStaticInner lazySingletonStaticInner = new LazySingletonStaticInner();
    }

    public static LazySingletonStaticInner getInstance(){
        return InnerClass.lazySingletonStaticInner;
    }

}
