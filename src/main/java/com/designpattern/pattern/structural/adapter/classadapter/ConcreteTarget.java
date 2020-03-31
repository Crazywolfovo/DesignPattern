package com.designpattern.pattern.structural.adapter.classadapter;

/**
 * 目标实现类
 */
public class ConcreteTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }

}
