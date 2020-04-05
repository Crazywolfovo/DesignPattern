package com.designpattern.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

public class ArticleApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getArticle())) {
            System.out.println(course.getName() + "含有手记，批准");
            if (null != approver) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含手记，不批准，流程结束");
        }
    }
}
