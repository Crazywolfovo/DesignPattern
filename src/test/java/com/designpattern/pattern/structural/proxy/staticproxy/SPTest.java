package com.designpattern.pattern.structural.proxy.staticproxy;

import com.designpattern.pattern.structural.proxy.service.Order;
import org.junit.Test;

public class SPTest {

    @Test
    public void test() {
        Order order = new Order();
        order.setUserId(4);

        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
    }
}
