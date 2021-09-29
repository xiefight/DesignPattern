package com.xt.design.pattern.creational.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description: 枚举保护单例
 * @Author: xietao
 * @Date: 2021-09-28 09:04
 **/
public class EnumProtect {

    public static void main(String[] args) throws Exception {

        //serializableBroken();
//        reflectBroken();

        EnumSingleton.SINGLETON.testEnumMethod("aaa");

    }

    /**
     * 反射攻击
     */
    private static void reflectBroken() throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class c = EnumSingleton.class;
        //结果在此处会报 NoSuchMethodException  无无参构造器异常
//        Constructor con = c.getConstructor();
        Constructor con = c.getDeclaredConstructor();
        con.setAccessible(true);

        EnumSingleton singleton = EnumSingleton.SINGLETON;

        //java.lang.IllegalArgumentException  Cannot reflectively create enum objects
        EnumSingleton singletonReflect = (EnumSingleton) con.newInstance("xt",666);

        System.out.println(singletonReflect == singleton);


    }

    /**
     * 序列化攻击
     */
    private static void serializableBroken() throws IOException, ClassNotFoundException {
        //创建一个枚举单例
        EnumSingleton singleton = EnumSingleton.SINGLETON;
        singleton.setData("我是枚举单例");
        //通过序列化反序列化获取
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("enumSingleton"));
        oos.writeObject(singleton);
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("enumSingleton"));
        EnumSingleton singletonAfter = (EnumSingleton) ois.readObject();
        System.out.println(singleton.getData());
        System.out.println(singletonAfter.getData());
        System.out.println(singletonAfter.getData() == singleton.getData());
        System.out.println(singletonAfter == singleton);
    }

}

enum EnumSingleton {

    SINGLETON{
        @Override
        protected void testEnumMethod(String msg){
            System.out.println(msg);
        }
    };
    protected abstract void testEnumMethod(String msg);

    //定义一个属性--在序列化和反序列化时，ObjectInputStream碰到枚举类型，会直接将对象返回（效果类似于深拷贝）
    private String data;

    EnumSingleton() {
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}

