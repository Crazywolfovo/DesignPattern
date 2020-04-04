package com.designpattern.pattern.behavioral.memento;

import lombok.Getter;

/**
 * 快照
 */
@Getter
public class ArticalMemento {

    private String title;
    private String content;
    private String images;

    public ArticalMemento(String title, String content, String images) {
        this.title = title;
        this.content = content;
        this.images = images;
    }

    @Override
    public String toString() {
        return "ArticalMemento{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
