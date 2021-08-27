package com.xt.design.principle.dependinversion.after;

import com.xt.design.principle.dependinversion.after.ICourse;

/**
 * @Description: Geely学习
 * 构造器方式注入实现
 * @Author: xietao
 * @Date: 2021-08-26 21:34
 **/
public class GeelyConstract {

    private ICourse course;

    public GeelyConstract(ICourse course){
        this.course = course;
    }

    public void study(){
        course.studyCourse();
    }

}
