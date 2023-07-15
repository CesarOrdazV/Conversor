/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.test;

import com.conversor.model.Magnitud;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author César Ordaz
 */
public class TestMagnitud {
    public static void main(String[] args) {
        Magnitud metro = new Magnitud("1.00000000000000000");
        Magnitud pie = new Magnitud("3.2808399");
        String cantidad = "1132.356762345";
        String conversion = pie.conversion(cantidad, metro,6);
        
        JOptionPane.showMessageDialog(new JFrame(), conversion, "El resultado es", JOptionPane.PLAIN_MESSAGE);
    }
}
