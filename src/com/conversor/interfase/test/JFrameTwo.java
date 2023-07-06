package com.conversor.interfase.test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameTwo {
    
    private JFrame frame;

    public JFrameTwo() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("JFrameTwo");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(500, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
