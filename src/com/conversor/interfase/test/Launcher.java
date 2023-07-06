package com.conversor.interfase.test;

import javax.swing.SwingUtilities;

import com.conversor.interfase.test.MainFrame;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame main = new MainFrame();
        });
    }
}