package com.designpattern.pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class Staff {
    private List<Command> list = new ArrayList<>();

    public void addCommand(Command command) {
        list.add(command);
    }

    public void executeCommands() {
        for (Command command : list) {
            command.execute();
        }
        list.clear();
    }
}
