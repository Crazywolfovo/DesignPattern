package com.designpattern.pattern.behavioral.chainofresponsibility;

import org.springframework.util.StringUtils;

public class VideoApprover extends Approver {
    @Override
    public void deploy(Course course) {
        if (!StringUtils.isEmpty(course.getVideo())) {
            System.out.println(course.getName() + "含有视频，批准");
            if (null != approver) {
                approver.deploy(course);
            }
        } else {
            System.out.println(course.getName() + "不含视频，不批准，流程结束");
        }
    }
}
