package com.designpattern.pattern.creational.prototype;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Pig implements Cloneable {
    private String name;
    private Date birthday;

    public Pig(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        Pig pig = (Pig) super.clone();

        //深克隆，针对对象的引用对象进行克隆，很关键
        pig.birthday = (Date) pig.birthday.clone();
        return pig;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}' + super.toString();
    }
}
