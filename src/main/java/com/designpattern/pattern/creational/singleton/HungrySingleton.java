package com.designpattern.pattern.creational.singleton;

import java.io.Serializable;

/**
 * 无懒加载特性
 */
public class HungrySingleton implements Serializable, Cloneable {

    /**
     * final 不可变
     */
    private final static HungrySingleton instance;

    static {
        instance = new HungrySingleton();
    }

    /**
     * 防止外部的new操作
     * 防止反射攻击
     */
    private HungrySingleton() {
        if (instance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public static HungrySingleton getInstance() {
        return instance;
    }

    private Object readResolve() {
        return instance;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return getInstance();
    }
}
