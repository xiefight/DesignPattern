package com.xt.design.pattern.structural.适配器模式.电池充电案例;

/**
 * @Description: 220交流电
 * @Author: xietao
 * @Date: 2021-10-27 21:57
 **/
public class AC220 {

    public int outputAC220V(){
        System.out.println("输出交流电220V");
        return 220;
    }

}
