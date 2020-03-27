package com.designpattern.pattern.creational.singleton;

/**
 * effcetive java推荐的单例模式
 */
public enum EnumInstance {
    INSTANCE {
        public void printTest() {
            System.out.println("Print Test");
        }
    };

    public abstract void printTest();

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public static EnumInstance getInstance() {
        return INSTANCE;
    }

}
