package com.xt.design.principle.dependinversion.after;

/**
 * @Description: 高层测试
 * @Author: xietao
 * @Date: 2021-08-26 21:33
 **/
public class Test {

    public static void main(String[] args) {
        Geely geely = new Geely();
        geely.study(new JavaCourse());
        /*
        Geely再学习其他课程，不需要修改JavaCourse和Geely
        只需要添加ICourse的实现类
        即面向接口编程
         */
        geely.study(new FECourse());
        geely.study(new PythonCourse());
    }

}
