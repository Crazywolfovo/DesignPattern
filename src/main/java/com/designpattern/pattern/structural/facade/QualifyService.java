package com.designpattern.pattern.structural.facade;

/**
 * 检查用户兑换资格
 */
public class QualifyService {
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过,库存通过");
        return true;
    }
}
