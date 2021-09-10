package com.xt.design.principle.demeter.after;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-09-06 20:56
 **/
public class Test {

    public static void main(String[] args) {

        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();

        boss.commendCourseNumbers(teamLeader);

    }

}
