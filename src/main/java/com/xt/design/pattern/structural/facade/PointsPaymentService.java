package com.xt.design.pattern.structural.facade;

/**
 * @Description: 积分支付子系统
 * @Author: xietao
 * @Date: 2021-10-13 19:54
 **/
public class PointsPaymentService {
    public boolean pay(PointsGift pointsGift) {
        //扣减积分
        System.out.println("支付：" + pointsGift.getGiftName() + " 积分扣减成功");
        return true;
    }
}
