package com.xt.design.principle.dependinversion.after;

/**
 * @Description: 学习java
 * @Author: xietao
 * @Date: 2021-08-26 21:32
 **/
public class FECourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("xt在学习FE");
    }
}
