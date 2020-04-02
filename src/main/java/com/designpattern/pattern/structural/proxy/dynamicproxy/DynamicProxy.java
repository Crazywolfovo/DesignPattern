package com.designpattern.pattern.structural.proxy.dynamicproxy;

import com.designpattern.pattern.structural.proxy.db.DataSourceContextHolder;
import com.designpattern.pattern.structural.proxy.service.Order;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，将所有的代理类合并为一个，
 * 利用这个动态代理类，为被代理对象
 * 生成一个符合条件的代理类的对象以供使用
 */
public class DynamicProxy implements InvocationHandler {

    private Object target;

    public DynamicProxy(Object target) {
        this.target = target;
    }

    public Object bind() {
        Class clazz = target.getClass();
        return Proxy.newProxyInstance(clazz.getClassLoader(), clazz.getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);
        Object object = method.invoke(target, args);
        afterMethod();
        return object;
    }

    private void beforeMethod(Object obj) {
        int userId = 0;
        System.out.println("动态代理 before code");
        if (obj instanceof Order) {
            Order order = (Order) obj;
            userId = order.getUserId();
        }
        int dbRouter = userId % 2;
        System.out.println("动态代理分配到【db" + dbRouter + "】处理数据");

        //todo 设置dataSource;
        DataSourceContextHolder.setDBType("db" + String.valueOf(dbRouter));
    }

    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}
