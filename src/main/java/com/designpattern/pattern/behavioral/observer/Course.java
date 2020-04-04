package com.designpattern.pattern.behavioral.observer;

import lombok.Getter;

import java.util.Observable;

/**
 * 被观察对象
 */
public class Course extends Observable {

    @Getter
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }


    public void produceQuestion(Course course, Question question) {
        System.out.println(question.getUserName() + "在" + course.getCourseName() + "提交了一个问题 ");
        setChanged();
        notifyObservers(question);
    }
}
