package com.designpattern.principle.dependenceinversion;

/**
 * 学生类
 */
public class Student {

    /**
     * 定义接口，而不是具体的实现类，
     * 使Student类与java、python这些实现类无关
     */
    private ICourse iCourse;


    public void studyCourse() {
        iCourse.studyCourse();
    }

    /**
     * 构造器注入，使接口获得相应实现
     */
    public void setiCourse(ICourse iCourse) {
        this.iCourse = iCourse;
    }

}
