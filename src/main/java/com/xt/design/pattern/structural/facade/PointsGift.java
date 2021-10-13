package com.xt.design.pattern.structural.facade;

/**
 * @Description: 积分兑换的礼物
 * @Author: xietao
 * @Date: 2021-10-13 19:51
 **/
public class PointsGift {
    //礼物名称
    private String giftName;
    //礼物库存等属性

    public PointsGift(String giftName) {
        this.giftName = giftName;
    }

    public String getGiftName() {
        return giftName;
    }
}
