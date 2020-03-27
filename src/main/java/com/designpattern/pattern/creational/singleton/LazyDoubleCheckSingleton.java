package com.designpattern.pattern.creational.singleton;

/**
 * volatile + DoubleCheck
 * Thread Safe
 */
public class LazyDoubleCheckSingleton {

    /**
     * volatile：
     * 保证了不同线程对这个变量进行操作时的可见性，即一个线程修改了某个变量的值，这新值对其他线程来说是立即可见的。（实现可见性）
     * 禁止进行指令重排序。（实现有序性）
     * volatile 只能保证对单次读/写的原子性。i++ 这种操作不能保证原子性。
     */
    private volatile static LazyDoubleCheckSingleton instance = null;

    /**
     * 防止外部的new操作
     */
    private LazyDoubleCheckSingleton() {
    }

    public static LazyDoubleCheckSingleton getInstance() {
        if (null == instance) {
            // lazySingleton 可能被 new 两次
            synchronized (LazyDoubleCheckSingleton.class) {
                if (null == instance) {
                    // 1.分配内存给这个对象
                    // 2.初始化对象
                    // 3.设置lazyDoubleCheckSingleton 指向刚分配的内存地址
                    // 其中2、3步骤存在指令重排序现象，导致实际执行顺序为：1->3->2
                    // intra-thread semantics
                    instance = new LazyDoubleCheckSingleton();
                }
            }
        }
        return instance;
    }
}
