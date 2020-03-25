package com.designpattern.principle.dependenceinversion;

import org.junit.Test;

/**
 * 依赖倒置原则的原始定义为：
 * 高层模块不应该依赖低层模块，两者都应该依赖其抽象；抽象不应该依赖细节，细节应该依赖抽象。
 * 其核心思想是：要面向接口编程，不要面向实现编程。
 */
public class DependenceInVersionTest {

    @Test
    public void test() {
        Student student = new Student();
        // 注入不同的实现类，实现不同的结果
        student.setiCourse(new JavaCourse());
        student.studyCourse();
        student.setiCourse(new PythonCourse());
        student.studyCourse();
    }

}
