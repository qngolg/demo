package com.example.demo.swing;

import javax.swing.*;
import java.awt.*;

public class SwingExample extends JFrame {

    public SwingExample() throws HeadlessException {
        setTitle("hello world");
        setSize(300, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingExample example = new SwingExample();
        example.setVisible(true);
    }
}
