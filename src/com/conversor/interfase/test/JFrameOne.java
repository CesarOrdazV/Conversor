package com.conversor.interfase.test;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class JFrameOne extends JFrame {
    
    public JFrameOne() {
        initialize();
    }

    public void initialize() {
        setTitle("JFrameOne");
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setSize(500, 400);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
