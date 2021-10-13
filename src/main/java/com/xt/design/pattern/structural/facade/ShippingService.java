package com.xt.design.pattern.structural.facade;

/**
 * @Description: 物流子系统
 * @Author: xietao
 * @Date: 2021-10-13 19:56
 **/
public class ShippingService {
    public String shipGift(PointsGift pointsGift) {
        //物流系统对接
        System.out.println(pointsGift.getGiftName() + "进入物流系统");
        return "666";
    }
}
