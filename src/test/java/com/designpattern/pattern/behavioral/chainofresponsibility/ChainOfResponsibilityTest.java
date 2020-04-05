package com.designpattern.pattern.behavioral.chainofresponsibility;

import org.junit.Test;

public class ChainOfResponsibilityTest {

    @Test
    public void test() {
        Approver articleApprover = new ArticleApprover();
        Approver videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java设计模式");
        course.setArticle("手记");
        //course.setVideo("视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);
    }
}
