package com.designpattern.pattern.behavioral.status;

import lombok.Getter;

public class CourseVideoContext {

    @Getter
    private CourseVideoState courseVideoState;

    public void setCourseVideoState(CourseVideoState courseVideoState) {
        this.courseVideoState = courseVideoState;
        //更新上下文对象为最新状态
        this.courseVideoState.setCourseVideoContext(this);
    }

    public final static PlayState PLAY_STATE = new PlayState();
    public final static StopState Stop_STATE = new StopState();
    public final static PauseState PAUSE_STATE = new PauseState();
    public final static SpeedState SPEED_STATE = new SpeedState();

    public void play() {
        this.courseVideoState.play();
    }

    public void pause() {
        this.courseVideoState.pause();
    }

    public void speed() {
        this.courseVideoState.speed();
    }

    public void stop() {
        this.courseVideoState.stop();
    }
}
