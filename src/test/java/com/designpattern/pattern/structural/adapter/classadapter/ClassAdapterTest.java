package com.designpattern.pattern.structural.adapter.classadapter;

import org.junit.Test;


public class ClassAdapterTest {

    @Test
    public void test() {
        Target target = new ConcreteTarget();
        target.request();

        Target adapter = new Adapter();
        adapter.request();
    }
}
