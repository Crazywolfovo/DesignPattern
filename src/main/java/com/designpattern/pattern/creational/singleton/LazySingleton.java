package com.designpattern.pattern.creational.singleton;

/**
 * Thread UnSafe
 */
public class LazySingleton {

    private static LazySingleton instance = null;

    /**
     * 防止外部的new操作
     */
    private LazySingleton() {
        if(instance != null){
            throw new RuntimeException("单例构造器禁止反射调用");
        }
    }

    public synchronized static LazySingleton getInstance() {
        if (null == instance) {
            // lazySingleton 可能被 new 两次
            instance = new LazySingleton();
        }
        return instance;
    }
}
