package com.designpattern.pattern.creational.singleton;

/**
 * 基于类初始化的延迟加载解决方案：静态内部类
 * Threa Safe
 * instance的创建过程指令重排序，对外部实例不可见，保证线程安全
 */
public class StaticInnerClassSingleton {

    /**
     * InnerClass 存在初始化锁，保证其内部过程对外部不可见
     */
    private static class InnerClass {
        private static StaticInnerClassSingleton instance = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance() {
        return InnerClass.instance;
    }

    /**
     * 防止外部的new操作
     */
    private StaticInnerClassSingleton() {
        if (InnerClass.instance != null) {
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }
}
