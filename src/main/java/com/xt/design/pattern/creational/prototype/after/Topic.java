package com.xt.design.pattern.creational.prototype.after;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-23 19:39
 **/
@Data
public class Topic {

    private String key;
    private Map<String, String> option;

    public Topic(HashMap<String, String> optionNew, String keyNew) {
        this.option = optionNew;
        this.key = keyNew;
    }
}
