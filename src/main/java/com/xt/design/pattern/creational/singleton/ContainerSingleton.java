package com.xt.design.pattern.creational.singleton;

import com.sun.xml.internal.ws.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 容器单例
 * @Author: xietao
 * @Date: 2021-09-29 14:56
 **/
public class ContainerSingleton {

    private ContainerSingleton() {
    }

    private static Map<String, Object> containerMap = new HashMap(4);

    public static void putInstance(String key, Object instance) {
        if (key != null && instance != null) {
            if (!containerMap.containsKey(key)) {
                containerMap.put(key, instance);
            }
        }
    }

    public static Object getInstance(String key) {
        return containerMap.get(key);
    }

}
