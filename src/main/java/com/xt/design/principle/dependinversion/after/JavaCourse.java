package com.xt.design.principle.dependinversion.after;

/**
 * 这是低层模块
 * @Description: 学习java
 * @Author: xietao
 * @Date: 2021-08-26 21:32
 **/
public class JavaCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("xt在学习java");
    }
}
