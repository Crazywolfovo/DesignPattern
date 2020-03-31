package com.designpattern.pattern.structural.adapter.objectadapter.example;

import org.junit.Test;

public class AdapterTest {

    @Test
    public void test() {
        DC5 dc5 = new PowerAdapter();
        dc5.outputDC5V();
    }
}
