package com.xt.design.pattern.creational.prototype.after;

import com.xt.design.pattern.creational.prototype.AnswerQuestion;
import com.xt.design.pattern.creational.prototype.ChoiceQuestion;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @Description: 原型模式重构
 * @Author: xietao
 * @Date: 2021-09-23 19:24
 **/
@Data
public class QuestionBank implements Cloneable {

    private String candidate; // 考⽣生
    private String number; // 考号

    private ArrayList<ChoiceQuestion> choiceQuestionList = new ArrayList<ChoiceQuestion>();
    private ArrayList<AnswerQuestion> answerQuestionList = new ArrayList<AnswerQuestion>();

    /*
    两个append：对各项题目的添加
     */
    public QuestionBank append(ChoiceQuestion choiceQuestion) {
        choiceQuestionList.add(choiceQuestion);
        return this;
    }

    public QuestionBank append(AnswerQuestion answerQuestion) {
        answerQuestionList.add(answerQuestion);
        return this;
    }

    /*
    核心操作：对对象的复制
    这里的复制不仅包括自身，同时对两个集合也做了复制。只有这样的拷贝才能确保在操作克隆对象的时候不影响原对象
     */
    @Override
    public Object clone() throws CloneNotSupportedException {
        //克隆本对象
        QuestionBank questionBank = (QuestionBank) super.clone();
        //克隆本对象中的属性
        questionBank.choiceQuestionList = (ArrayList<ChoiceQuestion>) choiceQuestionList.clone();
        questionBank.answerQuestionList = (ArrayList<AnswerQuestion>) answerQuestionList.clone();
        //其他业务操作
        //题目乱序
        Collections.shuffle(questionBank.getChoiceQuestionList());
        Collections.shuffle(questionBank.getAnswerQuestionList());

        //选择题答案乱序
        ArrayList<ChoiceQuestion> choiceQuestionList = questionBank.choiceQuestionList;
        for (ChoiceQuestion question : choiceQuestionList) {
            Topic random = TopicRandomUtil.random(question.getOption(),
                    question.getKey());
            question.setOption(random.getOption());
            question.setKey(random.getKey());
        }
        return questionBank;
    }


}
