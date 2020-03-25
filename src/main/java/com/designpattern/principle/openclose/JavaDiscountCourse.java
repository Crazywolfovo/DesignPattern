package com.designpattern.principle.openclose;

/**
 * 课程实现--java打折课程
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    /**
     * 获取折扣价格
     * 此方法是对扩展开放的表现
     *
     * @return
     */
    public Double getDiscountPrice() {
        return super.getPrice() * 0.8;
    }

}
