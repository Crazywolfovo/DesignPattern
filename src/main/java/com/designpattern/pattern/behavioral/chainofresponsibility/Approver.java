package com.designpattern.pattern.behavioral.chainofresponsibility;

/**
 * 批准者
 */
public abstract class Approver {
    /**
     * 声明一个自己类型的批准者
     * 为了子类可以获取
     */
    protected Approver approver;

    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    public abstract void deploy(Course course);
}
