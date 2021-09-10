package com.xt.design.principle.demeter.before;

import java.util.List;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-06 20:52
 **/
public class TeamLeader {

    public void checkCourseNumbers(List<Course> courses) {
        System.out.println(courses.size());
    }

}
