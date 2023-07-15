package com.conversor.test;

import com.conversor.connection.URLReader;

public class TestURLParser {

    public static void main(String[] args) {

        URLReader reader = new URLReader();
        String[] ratios = {"MXN", "USD", "EUR", "GBP", "JPY", "KRW"};
        
        try {
            for (String ratio : ratios) {
                System.out.println(reader.getRatio(ratio));
            }
        } catch (Exception exception) {
            System.err.println("No es posible conectarse al servicio.");
        }
    }
}
