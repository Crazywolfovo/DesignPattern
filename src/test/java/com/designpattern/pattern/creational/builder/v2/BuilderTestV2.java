package com.designpattern.pattern.creational.builder.v2;

import org.junit.Test;

/**
 * 链式调用
 */
public class BuilderTestV2 {

    @Test
    public void test() {
        Course course = new Course.CourseBuilder()
                .buildCourseName("Java设计模式精讲")
                .buildCoursePPT("Java设计模式精讲PPT")
                .buildCourseVideo("Java设计模式精讲视频")
                .build();

        System.out.println(course);
    }
}
