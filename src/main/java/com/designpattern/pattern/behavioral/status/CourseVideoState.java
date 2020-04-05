package com.designpattern.pattern.behavioral.status;

import lombok.Setter;

public abstract class CourseVideoState {

    @Setter
    protected CourseVideoContext courseVideoContext;

    public abstract void play();

    public abstract void pause();

    public abstract void speed();

    public abstract void stop();
}
