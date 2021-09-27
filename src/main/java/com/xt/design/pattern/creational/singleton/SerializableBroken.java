package com.xt.design.pattern.creational.singleton;

import java.io.*;

/**
 * @Description: 序列化破坏单例
 * 以饿汉式单例为例
 * @Author: xietao
 * @Date: 2021-09-27 08:49
 **/
public class SerializableBroken {

    public static void main(String[] args) throws IOException, ClassNotFoundException {

        HungrySingleton hungrySingleton = HungrySingleton.getInstance();

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("singletonBroken"));

        oos.writeObject(hungrySingleton);

        File file = new File("singletonBroken");

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));

        HungrySingleton hungryDuplicate = (HungrySingleton) ois.readObject();

        System.out.println(hungryDuplicate == hungrySingleton);

    }

}
