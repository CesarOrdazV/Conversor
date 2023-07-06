package com.conversor.test;

import com.conversor.connection.URLReader;
import com.excepcion.Excepcion;

public class TestURLParser {
    public static void main(String[] args) throws Excepcion {
        URLReader reader = new URLReader();
        String resultado = reader.getRatio("MXN");
        System.out.println(resultado + " longitud: " + resultado.length());
    }
}
