package com.conversor.test;

import com.conversor.connection.URLParser;

public class TestURLParser {
    public static void main(String[] args) {
        URLParser parser = new URLParser();
        String resultado = parser.getRatio("MXN");
        System.out.println(resultado + " longitud: " + resultado.length());
    }
}
