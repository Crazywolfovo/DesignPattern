package com.designpattern.pattern.behavioral.visitor;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class VisitorTest {

    @Test
    public void test(){
        List<Course> courseList = new ArrayList<>();
        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("免费课程");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("付费课程");
        codingCourse.setPrice(100);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course: courseList) {
            course.accpet(new Visitor());
        }
    }
}
