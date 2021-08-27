package com.xt.design.principle.dependinversion.after;

import com.xt.design.principle.dependinversion.after.ICourse;

/**
 * 这是高层模块
 * @Description: Geely学习
 * @Author: xietao
 * @Date: 2021-08-26 21:34
 **/
public class Geely {

    public void study(ICourse course){
        course.studyCourse();
    }

}
