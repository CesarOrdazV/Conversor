package com.conversor.interfase.test;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class MainFrame {
    private JFrame frame;
    private JPanel panel;
    private JButton button;

    public MainFrame() {
        initialize();
    }

    public void initialize() {
        frame = new JFrame();
        frame.setTitle("Java Swing Demo");
        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        button = createButton("Button", ".env/icons/print.png");
        panel.add(button);

        frame.add(panel);
    }

    public JButton createButton(String text, String file) {
        JButton myButton = new JButton(text);
        myButton.setFocusable(false);

        ImageIcon printIcon = new ImageIcon(file);
        myButton.setIcon(printIcon);
        myButton.setIconTextGap(10);

        myButton.setToolTipText("Algo de texto para el botón");

        myButton.setFont(new Font("Arial", Font.PLAIN, 16));

        myButton.setMargin(new Insets(20, 20, 20, 20));

        myButton.addActionListener((ActionEvent event) -> System.out.println("¡Hola! Presionaste el botón."));

        //myButton.setEnabled(false);
        
        myButton.setMnemonic(KeyEvent.VK_B);

        myButton.doClick();

        myButton.setVerticalTextPosition(SwingConstants.CENTER);
        myButton.setHorizontalTextPosition(SwingConstants.LEFT);

        myButton.setPreferredSize(new Dimension(200, 75));

        return myButton;
    }

    public void show() {
        this.frame.setVisible(true);
    }
}
