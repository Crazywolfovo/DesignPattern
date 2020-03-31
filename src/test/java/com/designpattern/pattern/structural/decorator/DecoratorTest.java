package com.designpattern.pattern.structural.decorator;

import org.junit.Test;

/**
 * Created by geely
 */
public class DecoratorTest {

    @Test
    public void test() {
        ABattercake aBattercake;
        aBattercake = new Battercake();
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new EggDecorator(aBattercake);
        aBattercake = new SausageDecorator(aBattercake);

        System.out.println(aBattercake.getDesc() + " 销售价格:" + aBattercake.cost());

    }
}
