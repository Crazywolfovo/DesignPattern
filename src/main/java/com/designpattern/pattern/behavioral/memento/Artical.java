package com.designpattern.pattern.behavioral.memento;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Artical {
    private String title;
    private String content;
    private String images;

    public Artical(String title, String content, String images) {
        this.title = title;
        this.content = content;
        this.images = images;
    }

    public ArticalMemento saveToMemento() {
        return new ArticalMemento(title, content, images);
    }

    public void undoFromMemento(ArticalMemento articalMemento) {
        this.content = articalMemento.getContent();
        this.title = articalMemento.getTitle();
        this.images = articalMemento.getImages();
    }

    @Override
    public String toString() {
        return "Artical{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", images='" + images + '\'' +
                '}';
    }
}
