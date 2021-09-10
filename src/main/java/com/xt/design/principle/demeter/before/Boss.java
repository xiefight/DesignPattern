package com.xt.design.principle.demeter.before;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 迪米特法则：最少知道原则，只让朋友知道（朋友指类中的成员变量、方法入参、返回值），非朋友：方法内的变量
 *
 * 在该方法中，和Boss是朋友的是teamLeader，方法体内的Course和Boss并不是朋友，所以boss可以和teamLeader发生关系，不应该和course产生交流
 *
 * @Description: boss让teamLeader查一下现在有多少课程
 * @Author: xietao
 * @Date: 2021-09-06 20:52
 **/
public class Boss {

    /**
     * @param teamLeader 要通知的TeamLeader
     */
    public void commendCourseNumbers(TeamLeader teamLeader) {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courses.add(new Course());
        }
        teamLeader.checkCourseNumbers(courses);
    }

}
