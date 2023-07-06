package com.conversor.interfase.test;

import javax.swing.SwingUtilities;

public class TestJFrame {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrameOne frame1 = new JFrameOne();
            JFrameTwo frame2 = new JFrameTwo();
        });
    }
}
