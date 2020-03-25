package com.designpattern.principle.liskovsubstitution;

/**
 * 里氏替换原则（Liskov Substitution Principle，LSP）由麻省理工学院计算机科学实验室的里斯科夫（Liskov）女士在 1987 年的“面向对象技术的高峰会议”（OOPSLA）上发表的一篇文章《数据抽象和层次》（Data Abstraction and Hierarchy）里提出来的，
 * 她提出：继承必须确保超类所拥有的性质在子类中仍然成立（Inheritance should ensure that any property proved about supertype objects also holds for subtype objects）。
 * <p>
 * 里氏替换原则主要阐述了有关继承的一些原则，也就是什么时候应该使用继承，什么时候不应该使用继承，以及其中蕴含的原理。
 * 里氏替换原是继承复用的基础，它反映了基类与子类之间的关系，是对开闭原则的补充，是对实现抽象化的具体步骤的规范。
 * <p>
 * 里氏替换原则通俗来讲就是：子类可以扩展父类的功能，但不能改变父类原有的功能。
 * 也就是说：子类继承父类时，除添加新的方法完成新增功能外，尽量不要重写父类的方法。
 */
public class liskovsubstitutionTest {
}
