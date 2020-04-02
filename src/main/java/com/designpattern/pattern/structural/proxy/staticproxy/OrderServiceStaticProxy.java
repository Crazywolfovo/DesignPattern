package com.designpattern.pattern.structural.proxy.staticproxy;

import com.designpattern.pattern.structural.proxy.db.DataSourceContextHolder;
import com.designpattern.pattern.structural.proxy.service.IOrderService;
import com.designpattern.pattern.structural.proxy.service.Order;
import com.designpattern.pattern.structural.proxy.service.OrderServiceImpl;

/**
 * 静态代理，不依赖反射技术，每一个被代理类
 * 都需要一个对应的代理类，导致类数量多一倍
 */
public class OrderServiceStaticProxy {

    private IOrderService iOrderService = new OrderServiceImpl();

    public int saveOrder(Order order) {
        beforeMethod(order);
        int result = iOrderService.saveOrder(order);
        afterMethod();
        return result;
    }

    private void beforeMethod(Order order) {
        int userId = order.getUserId();
        int dbRouter = userId % 2;
        System.out.println("静态代理分配到【db" + dbRouter + "】处理数据");

        // 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
        System.out.println("静态代理 before code");
    }

    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}
