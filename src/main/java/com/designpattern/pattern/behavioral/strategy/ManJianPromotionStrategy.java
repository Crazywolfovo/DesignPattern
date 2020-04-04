package com.designpattern.pattern.behavioral.strategy;

/**
 * 具体策略3
 */
public class ManJianPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("满减促销,满200-20元");
    }
}
