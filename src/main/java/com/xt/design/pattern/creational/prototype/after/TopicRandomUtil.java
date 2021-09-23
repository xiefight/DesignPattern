package com.xt.design.pattern.creational.prototype.after;

import java.util.*;

/**
 * @Description: 题目选项乱序操作工具包
 * @Author: xietao
 * @Date: 2021-09-23 19:25
 **/
public class TopicRandomUtil {

    static public Topic random(Map<String, String> option, String key) {
        Set<String> keySet = option.keySet();
        ArrayList<String> keyList = new ArrayList<>(keySet);
        Collections.shuffle(keyList);
        HashMap<String, String> optionNew = new HashMap<>();
        int idx = 0;
        String keyNew = "";
        for (String next : keySet) {
            String randomKey = keyList.get(idx++);
            if (key.equals(next)) {
                keyNew = randomKey;
            }
            optionNew.put(randomKey, option.get(next));
        }
        return new Topic(optionNew, keyNew);
    }

}
