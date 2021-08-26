package com.xt.design.principle.dependinversion.before;

/**
 * @Description: 高层测试
 * @Author: xietao
 * @Date: 2021-08-26 21:11
 **/
public class Test {

    public static void main(String[] args) {

        Geely geely = new Geely();
        geely.studyJavaCourse();
        //如果要继续添加 Geely在学习前端、python需要在Geely类中修改，变成了面向实现编程
        geely.studyFECourse();
        geely.studyPythonCourse();


    }

}
