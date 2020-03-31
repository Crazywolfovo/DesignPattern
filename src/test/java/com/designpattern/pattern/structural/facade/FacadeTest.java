package com.designpattern.pattern.structural.facade;

import org.junit.Test;

public class FacadeTest {

    @Test
    public void test() {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
        giftExchangeService.giftExchange(pointsGift);
    }
}
