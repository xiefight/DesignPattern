package com.xt.design.pattern.structural.facade;

/**
 * @Description: 权限资格子系统
 * @Author: xietao
 * @Date: 2021-10-13 19:52
 **/
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验：" + pointsGift.getGiftName() + " 积分资格通过，库存通过");
        return true;
    }
}
