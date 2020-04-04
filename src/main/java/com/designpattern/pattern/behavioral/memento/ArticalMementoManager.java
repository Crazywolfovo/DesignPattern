package com.designpattern.pattern.behavioral.memento;

import java.util.Stack;

public class ArticalMementoManager {
    private final Stack<ArticalMemento> ARTICAL_MEMENTO_STACK = new Stack<>();

    public ArticalMemento getArticalMemento() {
        return ARTICAL_MEMENTO_STACK.pop();
    }

    public void addArticalMemento(ArticalMemento articalMemento) {
        ARTICAL_MEMENTO_STACK.push(articalMemento);
    }
}
