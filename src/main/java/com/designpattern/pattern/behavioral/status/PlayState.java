package com.designpattern.pattern.behavioral.status;

public class PlayState extends CourseVideoState {
    @Override
    public void play() {
        System.out.println("正常播放");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void speed() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.SPEED_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseVideoState(CourseVideoContext.Stop_STATE);
    }
}
