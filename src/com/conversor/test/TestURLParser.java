package com.conversor.test;

import com.conversor.connection.URLReader;

public class TestURLParser {
    public static void main(String[] args) {
        URLReader reader = new URLReader();
        String resultado = reader.getRatio("MXN");
        System.out.println(resultado + " longitud: " + resultado.length());
    }
}
