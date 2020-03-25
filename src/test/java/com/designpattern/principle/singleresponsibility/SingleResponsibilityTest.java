package com.designpattern.principle.singleresponsibility;

import org.junit.Test;

/**
 * 单一职责原则（Single Responsibility Principle，SRP）又称单一功能原则，
 * 由罗伯特·C.马丁（Robert C. Martin）于《敏捷软件开发：原则、模式和实践》一书中提出的。
 * 这里的职责是指类变化的原因，单一职责原则规定：
 * 一个类应该有且仅有一个引起它变化的原因，否则类应该被拆分。
 */
public class SingleResponsibilityTest {

    @Test
    public void test() {

        Bird bird = new Bird();
        bird.mainMoveMode("大雁");
        bird.mainMoveMode("鸵鸟");

        // Bird 被拆分为 FlyBird 和 WalkBird
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");

    }
}
