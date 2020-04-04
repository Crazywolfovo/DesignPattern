package com.designpattern.pattern.behavioral.observer;

import org.junit.Test;

public class ObserverTest {

    @Test
    public void test() {
        Course course = new Course("Java设计模式精讲");
        Teacher teacher = new Teacher("Alpha");
        Teacher teacher2 = new Teacher("Beta");

        course.addObserver(teacher);
        course.addObserver(teacher2);
        //业务逻辑代码
        Question question = new Question();
        question.setUserName("YZR");
        question.setQuestionContent("Java的主函数如何编写");

        course.produceQuestion(course, question);
    }
}
