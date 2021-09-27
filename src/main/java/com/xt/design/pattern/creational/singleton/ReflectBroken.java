package com.xt.design.pattern.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * @Description: 反射攻击
 * 以懒加载为例
 * @Author: xietao
 * @Date: 2021-09-27 21:47
 **/
public class ReflectBroken {

    public static void main(String[] args) throws Exception {

        Class objectClass = LazySingletonReflect.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);

        //通过方法获取对象
        LazySingletonReflect o1 = LazySingletonReflect.getInstance();
        //通过反射获取对象 -- 结果如预期，禁止通过私有构造器创建对象
        /*Class objectClass = LazySingletonReflect.class;
        Constructor c = objectClass.getDeclaredConstructor();
        c.setAccessible(true);
        LazySingletonReflect o2 = (LazySingletonReflect) c.newInstance();

        System.out.println(o1 == o2);*/

        //通过反射获取对象，既然反射可以修改构造方法权限，自然也可以修改属性权限
        //从o1中获取flag字段，并把o1的flag置为true
        Field flag = o1.getClass().getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(o1,true);
        LazySingletonReflect o2 = (LazySingletonReflect) c.newInstance();

        System.out.println(o1 == o2); //反射攻击成功，o2已经创建成功了，return false

    }

}

class LazySingletonReflect {

    private static LazySingletonReflect lazySingleton;

    //设置标志位防止反射攻击(其实防不住)
    private static boolean flag = true;
    private LazySingletonReflect() throws Exception {
        if (flag){
            flag = false;
        }else {
            throw new Exception("禁止通过私有构造器创建对象");
        }
    }

    public static LazySingletonReflect getInstance() throws Exception {
        if (lazySingleton == null){
            lazySingleton = new LazySingletonReflect();
        }
        return lazySingleton;
    }

}
