package com.xt.design.principle.dependinversion.before;

/**
 * @Description: 低层实现
 * @Author: xietao
 * @Date: 2021-08-26 21:10
 **/
public class Geely {

    public void studyJavaCourse(){
        System.out.println("xt在学习Java");
    }

    /*
    新加学习内容，则需要在实现中去修改
     */

    public void studyFECourse(){
        System.out.println("xt在学习FE");
    }

    public void studyPythonCourse(){
        System.out.println("xt在学习Python");
    }


}
