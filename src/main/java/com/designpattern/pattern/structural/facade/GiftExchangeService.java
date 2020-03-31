package com.designpattern.pattern.structural.facade;

/**
 * 积分兑换业务门面类
 */
public class GiftExchangeService {

    //引入，子流程，如果引入spring，则使用注入
    private QualifyService qualifyService = new QualifyService();
    private PointsPaymentService pointsPaymentService = new PointsPaymentService();
    private ShippingService shippingService = new ShippingService();

    /**
     * 业务流程集合
     * 由子流程拼接
     *
     * @param pointsGift
     */
    void giftExchange(PointsGift pointsGift) {
        if (qualifyService.isAvailable(pointsGift)) {
            //资格校验通过
            if (pointsPaymentService.pay(pointsGift)) {
                //如果支付积分成功
                String shippingOrderNo = shippingService.shipGift(pointsGift);
                System.out.println("物流系统下单成功,订单号是:" + shippingOrderNo);
            }
        }
    }

}
