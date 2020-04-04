package com.designpattern.pattern.behavioral.strategy;

/**
 * 作用：可用于消除if else代码
 * 使用时机：某个行为有多种实现方式
 */
public class StrategyTest {
    public static void main(String[] args) {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }
}
