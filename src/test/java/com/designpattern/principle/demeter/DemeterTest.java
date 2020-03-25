package com.designpattern.principle.demeter;

import org.junit.Test;

/**
 * 迪米特法则（Law of Demeter，LoD）又叫作最少知识原则（Least Knowledge Principle，LKP)，
 * 产生于 1987 年美国东北大学（Northeastern University）的一个名为迪米特（Demeter）的研究项目，
 * 由伊恩·荷兰（Ian Holland）提出，被 UML 创始者之一的布奇（Booch）普及，
 * 后来又因为在经典著作《程序员修炼之道》（The Pragmatic Programmer）提及而广为人知。
 * <p>
 * <p>
 * 迪米特法则的定义是：只与你的直接朋友交谈，不跟“陌生人”说话（Talk only to your immediate friends and not to strangers）。
 * 其含义是：如果两个软件实体无须直接通信，那么就不应当发生直接的相互调用，可以通过第三方转发该调用。
 * 其目的是降低类之间的耦合度，提高模块的相对独立性。
 * <p>
 * <p>
 * 迪米特法则中的“朋友”是指：当前对象本身、当前对象的成员对象、当前对象所创建的对象、当前对象的方法参数等，
 * 这些对象同当前对象存在关联、聚合或组合关系，可以直接访问这些对象的方法
 */
public class DemeterTest {

    @Test
    public void test() {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commandCheckNumber(teamLeader);

    }
}
