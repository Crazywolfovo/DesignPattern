package com.designpattern.pattern.behavioral.visitor;

import lombok.Getter;
import lombok.Setter;

public abstract class Course {

    @Getter
    @Setter
    private String name;

    public abstract void accpet(IVisitor iVisitor);
}
