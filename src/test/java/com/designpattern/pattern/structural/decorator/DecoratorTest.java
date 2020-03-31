package com.designpattern.pattern.structural.decorator;

import com.designpattern.pattern.structural.decorator.ABattercake;
import com.designpattern.pattern.structural.decorator.Battercake;
import com.designpattern.pattern.structural.decorator.EggDecorator;
import com.designpattern.pattern.structural.decorator.SausageDecorator;
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
