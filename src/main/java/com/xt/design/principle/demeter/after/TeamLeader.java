package com.xt.design.principle.demeter.after;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-06 20:52
 **/
public class TeamLeader {

    public void checkCourseNumbers() {
        List<Course> courses = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            courses.add(new Course());
        }
        System.out.println(courses.size());
    }

}
