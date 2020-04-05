package com.designpattern.pattern.behavioral.command;

import org.junit.Test;

public class CommandTest {

    @Test
    public void test(){
        CourseVideo courseVideo = new CourseVideo("Java设计模式");
        OpenCourseVideoCommand open = new OpenCourseVideoCommand(courseVideo);
        CloseCourseVideoCommand close = new CloseCourseVideoCommand(courseVideo);

        Staff staff = new Staff();
        staff.addCommand(open);
        staff.addCommand(close);
        staff.executeCommands();
    }
}
