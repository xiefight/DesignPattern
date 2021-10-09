package com.xt.design.pattern.creational.prototype;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: 原型模式的克隆破坏单例
 * @Author: xietao
 * @Date: 2021-10-09 19:43
 **/
public class 原型模式破坏单例 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        HungrySingleton instance = HungrySingleton.getInstance();

        Method method = instance.getClass().getDeclaredMethod("clone");

        method.setAccessible(true);

        HungrySingleton instance2 = (HungrySingleton) method.invoke(instance);

        System.out.println(instance);
        System.out.println(instance2);

    }

}

/**
 * 以饿汉式单例举例
 * @Author: xietao
 * @Date: 2021/10/9 19:43
 */
class HungrySingleton implements Cloneable{

    private static final HungrySingleton INSTANCE = new HungrySingleton();

    private HungrySingleton(){}

    public static HungrySingleton getInstance(){
        return INSTANCE;
    }

    //直接调用super.clone()会返回不同的对象
    //解决办法，直接返回INSTANCE
    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone();
        return getInstance();
    }
}
