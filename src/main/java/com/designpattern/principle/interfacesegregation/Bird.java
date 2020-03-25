package com.designpattern.principle.interfacesegregation;


public class Bird implements IAnimalAction {
    @Override
    public void eat() {

    }

    @Override
    public void fly() {

    }

    /**
     * 对于Bird类，swim是没用的
     */
    @Override
    public void swim() {

    }
}
