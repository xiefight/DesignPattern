package com.xt.design.principle.dependinversion.after;

import com.xt.design.principle.dependinversion.after.ICourse;

/**
 * @Description: Geely学习
 * Setter方式注入实现
 * @Author: xietao
 * @Date: 2021-08-26 21:34
 **/
public class GeelySetter {

    private ICourse course;

    public void setCourse(ICourse course){
        this.course = course;
    }

    public void study(){
        course.studyCourse();
    }

}
