package com.xt.design.pattern.structural.facade;

/**
 * @Description:
 * @Author: xietao
 * @Date: 2021-10-13 20:04
 **/
public class Test {

    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("裤子");

        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);

    }

}
