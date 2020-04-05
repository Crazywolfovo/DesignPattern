package com.designpattern.pattern.behavioral.mediator;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {

    public String name;

    public User(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        StudyGroup.showMessage(this, message);
    }
}
