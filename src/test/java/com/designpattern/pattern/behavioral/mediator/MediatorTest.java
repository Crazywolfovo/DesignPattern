package com.designpattern.pattern.behavioral.mediator;

import org.junit.Test;

public class MediatorTest {

    @Test
    public void test() {
        User tom = new User("Tom");
        User petter = new User("petter");

        tom.sendMessage("hello ~");
        petter.sendMessage("nice to meet you ~");
    }
}
