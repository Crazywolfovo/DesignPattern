package com.designpattern.pattern.behavioral.memento;

import org.junit.Test;

public class MementoTest {

    @Test
    public void test() {
        ArticalMementoManager articalMementoManager = new ArticalMementoManager();
        Artical artical = new Artical("如影随形的设计模式A", "手记内容A", "手记图片A");
        ArticalMemento articalMemento = artical.saveToMemento();
        articalMementoManager.addArticalMemento(articalMemento);

        System.out.println("手记完整信息" + artical);

        artical.setTitle("如影随形的设计模式B");
        artical.setContent("手记内容B");
        artical.setImages("手记图片B");

        System.out.println("修改后手记完整信息" + artical);
        articalMemento = artical.saveToMemento();
        articalMementoManager.addArticalMemento(articalMemento);

        artical.setTitle("如影随形的设计模式C");
        artical.setContent("手记内容C");
        artical.setImages("手记图片C");
        System.out.println("修改2次后手记完整信息" + artical);

        System.out.println("回退1次");
        articalMemento = articalMementoManager.getArticalMemento();
        artical.undoFromMemento(articalMemento);
        System.out.println("回退1次" + artical);

        System.out.println("回退2次");
        articalMemento = articalMementoManager.getArticalMemento();
        artical.undoFromMemento(articalMemento);
        System.out.println("回退2次" + artical);


    }
}
