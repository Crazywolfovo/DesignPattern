package com.designpattern.pattern.behavioral.visitor;

public class FreeCourse extends Course {
    @Override
    public void accpet(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
