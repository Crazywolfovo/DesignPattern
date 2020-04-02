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

        //order.setUserId(2);
        order.setUserId(1);

        //动态的生成一个OrderServiceImpl的代理对象，以供使用
        IOrderService orderServiceDynamicProxy = (IOrderService) new DynamicProxy(new OrderServiceImpl()).bind();

        orderServiceDynamicProxy.saveOrder(order);
    }
}
