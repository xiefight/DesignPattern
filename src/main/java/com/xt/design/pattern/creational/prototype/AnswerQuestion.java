package com.xt.design.pattern.creational.prototype;

import lombok.Data;

/**
 * @Description: 问答题
 * @Author: xietao
 * @Date: 2021-09-23 19:08
 **/
@Data
public class AnswerQuestion {

    private String name; //问题
    private String key; //答案

    public AnswerQuestion(){}

    public AnswerQuestion(String name, String key){
        this.name = name;
        this.key = key;
    }



}
