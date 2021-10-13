package com.xt.design.pattern.structural.facade;

/**
 * @Description: 对外提供积分兑换礼物并物流配送的服务
 * @Author: xietao
 * @Date: 2021-10-13 19:58
 **/
public class GiftExchangeService {

    //模拟Spring的依赖注入
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    public void giftExchange(PointsGift pointsGift) {
        //资格校验通过、积分通过
        if (qualifyService.isAvailable(pointsGift)) {
            //积分支付成功
            if (pointsPaymentService.pay(pointsGift)) {
                //返回订单号
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功，物流单号：" + shippingOrderNo);
            }
        }
    }

}
