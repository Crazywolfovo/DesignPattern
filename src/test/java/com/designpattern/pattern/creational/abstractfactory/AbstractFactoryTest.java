package com.designpattern.pattern.creational.abstractfactory;

import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void test() {
        CourseFactory courseFactory = new JavaCourseFactory();
        Video video = courseFactory.getVideo();
        Article article = courseFactory.getArticle();
        video.produce();
        article.produce();
    }
}
