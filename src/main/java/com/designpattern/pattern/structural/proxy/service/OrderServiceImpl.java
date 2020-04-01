package com.designpattern.pattern.structural.proxy.service;


public class OrderServiceImpl implements IOrderService {

    //Spring会自己注入，我们课程中就直接new了
    private IOrderDao iOrderDao = new OrderDaoImpl();

    @Override
    public int saveOrder(Order order) {
        System.out.println("Service层调用Dao层添加Order");
        return iOrderDao.insert(order);
    }

}
