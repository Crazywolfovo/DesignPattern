package com.designpattern;

import javax.swing.*;
import java.awt.*;

/**
 * Hello world!
 */
public class App extends JFrame {

    private void JFrameDemo() {
        setTitle("Java 第一个 GUI 程序");    //设置显示窗口标题
        setSize(400, 200);    //设置窗口显示尺寸
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    //置窗口是否可以关闭
        JLabel jl = new JLabel("这是使用JFrame类创建的窗口");    //创建一个标签
        Container c = getContentPane();    //获取当前窗口的内容窗格
        c.add(jl);    //将标签组件添加到内容窗格上
        setVisible(true);    //设置窗口是否可见
    }

    public static void main(String[] args) {
        new App().JFrameDemo();
        //System.out.println("Hello World!");
    }
}
