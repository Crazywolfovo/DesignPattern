package com.designpattern.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

public class CodingCourse extends Course {
    @Getter
    @Setter
    private int price;

    @Override
    public void accpet(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}
