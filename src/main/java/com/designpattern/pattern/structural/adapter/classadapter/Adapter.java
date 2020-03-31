package com.designpattern.pattern.structural.adapter.classadapter;

/**
 * 适配者
 */
public class Adapter extends Adaptee implements Target {

    /**
     * 适配操作
     * 将Adaptee.adapteeRequest()，适配成了Target.request()
     * 并且支持附加逻辑
     */
    @Override
    public void request() {
        //...
        super.adapteeRequest();
        //...
    }
}
