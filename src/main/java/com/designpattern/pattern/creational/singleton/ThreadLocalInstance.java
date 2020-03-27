package com.designpattern.pattern.creational.singleton;

/**
 * 线程唯一，全局不唯一
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> instance
            = ThreadLocal.withInitial(ThreadLocalInstance::new);

    private ThreadLocalInstance() {
    }

    public static ThreadLocalInstance getInstance() {
        return instance.get();
    }

}
