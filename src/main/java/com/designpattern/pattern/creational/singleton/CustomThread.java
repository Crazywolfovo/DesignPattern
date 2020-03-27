package com.designpattern.pattern.creational.singleton;

public class CustomThread implements Runnable {
    @Override
    public void run() {
        // LazySingleton instance = LazySingleton.getInstance();

        // LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();

        // StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();

//        ContainerSingleton.putInstance("object", new Object());
//        Object instance = ContainerSingleton.getInstance("object");

         ThreadLocalInstance instance = ThreadLocalInstance.getInstance();

        System.out.println(Thread.currentThread().getName() + " " + instance);
    }
}
