package com.designpattern.principle.openclose;


import org.junit.Test;

/**
 * 开闭原则（Open Closed Principle，OCP）由勃兰特·梅耶（Bertrand Meyer）提出，
 * 他在 1988 年的著作《面向对象软件构造》（Object Oriented Software Construction）中提出：
 * 软件实体应当对扩展开放，对修改关闭。这就是开闭原则的经典定义。
 */
public class OpenCloseTest {

    @Test
    public void test() {
        ICourse iCourse = new JavaDiscountCourse(96, "Java从零到企业级电商开发", 348d);
        JavaDiscountCourse javaCourse = (JavaDiscountCourse) iCourse;
        System.out.println("课程ID:" + javaCourse.getId()
                + " 课程名称:" + javaCourse.getName()
                + " 课程原价:" + javaCourse.getPrice()
                + " 课程折后价格:" + javaCourse.getDiscountPrice() + "元");
    }
}
