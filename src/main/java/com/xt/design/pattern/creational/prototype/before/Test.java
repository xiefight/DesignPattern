package com.xt.design.pattern.creational.prototype.before;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-23 19:23
 **/
public class Test {

    public static void main(String[] args) {
        QuestionBankController questionBankController = new
                QuestionBankController();
        System.out.println(questionBankController.createPaper("花花",
                "1000001921032"));
        System.out.println(questionBankController.createPaper("⾖豆⾖豆",
                "1000001921051"));
        System.out.println(questionBankController.createPaper("⼤大宝",
                "1000001921987"));
    }

}
