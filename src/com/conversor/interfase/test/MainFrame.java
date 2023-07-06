package com.conversor.interfase.test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class MainFrame {
    private JFrame frame;

    public MainFrame() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Java Swing Demo");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        
        frame.setVisible(true);
    }
}
