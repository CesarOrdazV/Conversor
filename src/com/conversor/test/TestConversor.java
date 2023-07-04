package com.conversor.test;

import com.conversor.connection.URLParser;
import com.conversor.model.Moneda;

public class TestConversor {
    public static void main(String[] args) {
        URLParser parser = new URLParser();

        Moneda pesos = new Moneda(parser.getRatio("MXN"));
        Moneda libras = new Moneda(parser.getRatio("GBP"));

        System.out.println(libras.conversion("100.00", pesos));
        System.out.println(pesos.conversion("100.00", libras));
    }
}
