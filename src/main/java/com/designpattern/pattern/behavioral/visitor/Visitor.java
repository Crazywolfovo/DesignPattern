package com.designpattern.pattern.behavioral.visitor;

public class Visitor implements IVisitor {
    @Override
    public void visit(CodingCourse course) {
        System.out.println("付费课程：" + course.getName() + ",价格是：" + course.getPrice() + "元");
    }

    @Override
    public void visit(FreeCourse course) {
        System.out.println("免费课程：" + course.getName());
    }
}
