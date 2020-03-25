package com.designpattern.principle.dependenceinversion;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("学生在学习Java课程");
    }
}
