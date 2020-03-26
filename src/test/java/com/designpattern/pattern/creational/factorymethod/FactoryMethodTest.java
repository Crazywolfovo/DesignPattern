package com.designpattern.pattern.creational.factorymethod;

import org.junit.Test;

public class FactoryMethodTest {

    @Test
    public void test() {
        VideoFactory videoFactory1 = new PythonVideoFactory();
        VideoFactory videoFactory2 = new JavaVideoFactory();
        VideoFactory videoFactory3 = new FEVideoFactory();
        Video video = videoFactory1.getVideo();
        video.produce();
    }
}
