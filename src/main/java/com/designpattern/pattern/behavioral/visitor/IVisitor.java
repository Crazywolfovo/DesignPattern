package com.designpattern.pattern.behavioral.visitor;

public interface IVisitor {
    void visit(CodingCourse course);

    void visit(FreeCourse course);
}
