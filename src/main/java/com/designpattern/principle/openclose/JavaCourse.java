package com.designpattern.principle.openclose;

/**
 * 课程实现--java课程
 */
public class JavaCourse implements ICourse {
    private Integer Id;
    private String name;
    private Double price;

    JavaCourse(Integer id, String name, Double price) {
        this.Id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.Id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

}
