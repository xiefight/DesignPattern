package com.xt.design.pattern.structural.享元模式;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @Description: 享元工厂
 * @Author: xietao
 * @Date: 2021-10-26 13:51
 **/
public class ActivityFactory {

    //工厂中维护一个map容器
    static Map<Long, Activity> activityMap = new HashMap<>();

    public static Activity getActivity(Long id) {
        //先从map中取
        Activity activity = activityMap.get(id);
        //判空
        if (null == activity) {
            //新建-模拟实际业务应用--调用接口获取活动信息
            activity = new Activity();
            activity.setId(1000L);
            activity.setName("一剪寒梅");
            activity.setDesc("优惠季");
            activity.setStartTime(new Date());
            activity.setStopTime(new Date());
            //将以上固定信息放到容器中
            activityMap.put(id, activity);
        }
        return activity;
    }


}
