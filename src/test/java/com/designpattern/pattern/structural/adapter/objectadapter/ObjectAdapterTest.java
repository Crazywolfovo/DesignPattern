package com.designpattern.pattern.structural.adapter.objectadapter;

import org.junit.Test;

/**
 * Created by geely
 */
public class ObjectAdapterTest {

    @Test
    public void test() {
        Target target = new ConcreteTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
