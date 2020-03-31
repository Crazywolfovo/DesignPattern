package com.designpattern.pattern.creational.prototype.abstractprototype;

/**
 * 基于抽象类的克隆
 */
public abstract class A implements Cloneable {
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
