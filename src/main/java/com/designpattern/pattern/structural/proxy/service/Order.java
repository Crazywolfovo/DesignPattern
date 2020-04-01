package com.designpattern.pattern.structural.proxy.service;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Order {
    private Object orderInfo;
    private Integer userId;
}
