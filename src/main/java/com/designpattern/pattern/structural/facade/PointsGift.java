package com.designpattern.pattern.structural.facade;

import lombok.Getter;

/**
 * 礼物：可用积分兑换
 */
public class PointsGift {

    @Getter
    private String name;

    public PointsGift(String name) {
        this.name = name;
    }
}
