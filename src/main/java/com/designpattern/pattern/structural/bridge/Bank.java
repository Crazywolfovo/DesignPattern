package com.designpattern.pattern.structural.bridge;

public abstract class Bank {
    /**
     * 通过组合方式形成桥接
     */
    protected Account account;

    public Bank(Account account) {
        this.account = account;
    }

    /**
     * 这个抽象方法，会委托给Account接口中的openAccount();
     *
     * @return
     */
    abstract Account openAccount();

}
