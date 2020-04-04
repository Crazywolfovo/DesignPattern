package com.designpattern.pattern.behavioral.strategy;

import org.junit.Test;

/**
 * 作用：可用于消除if else代码
 * 使用时机：某个行为有多种实现方式
 */
public class StrategyTest {

    @Test
    public void test() {
        PromotionActivity promotionActivity618 = new PromotionActivity(new LiJianPromotionStrategy());
        PromotionActivity promotionActivity1111 = new PromotionActivity(new FanXianPromotionStrategy());

        promotionActivity618.executePromotionStrategy();
        promotionActivity1111.executePromotionStrategy();
    }

    /**
     * 策略+工厂方法
     */
    @Test
    public void test2() {
        String promotionKey = "FANXIAN";
        PromotionActivity promotionActivity =
                new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.executePromotionStrategy();
    }
}
