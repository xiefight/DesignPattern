package com.xt.design.pattern.structural.享元模式;

import com.xt.design.pattern.structural.享元模式.util.RedisUtils;

/**
 * @Description: 统一查询控制管理类
 * @Author: xietao
 * @Date: 2021-10-26 13:51
 **/
public class ActivityController {

    private RedisUtils redisUtils = new RedisUtils();

    public Activity queryActivityInfo(Long id) {

        //先从享元工厂中获取内部信息(不变)
        Activity activity = ActivityFactory.getActivity(id);

        //再从Redis缓存中获取库存外部信息(变化)
        Stock stock = new Stock(1000, redisUtils.getStockUsed());

        activity.setStock(stock);

        return activity;

    }


}
