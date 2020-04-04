package com.designpattern.pattern.behavioral.strategy;

public class NullPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销策略~");
    }
}
