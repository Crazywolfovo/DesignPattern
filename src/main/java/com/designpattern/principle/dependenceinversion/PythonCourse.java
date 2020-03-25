package com.designpattern.principle.dependenceinversion;

public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("学生在学习Python课程");
    }
}
