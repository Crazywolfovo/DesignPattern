package com.designpattern.pattern.structural.proxy.dynamicproxy;

import com.designpattern.pattern.structural.proxy.service.IOrderService;
import com.designpattern.pattern.structural.proxy.service.Order;
import com.designpattern.pattern.structural.proxy.service.OrderServiceImpl;
import org.junit.Test;

/**
 * Created by geely
 */
public class DPTest {

    @Test
    public void test() {
        Order order = new Order();
//        order.setUserId(2);
        order.setUserId(1);
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
