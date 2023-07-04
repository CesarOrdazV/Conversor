package com.conversor.test;

import com.conversor.connection.URLReader;
import com.conversor.model.Moneda;

public class TestConversor {
    public static void main(String[] args) {
        URLReader reader = new URLReader();

        Moneda pesos = new Moneda(reader.getRatio("MXN"));
        Moneda libras = new Moneda(reader.getRatio("GBP"));

        System.out.println(libras.conversion("100.00", pesos));
        System.out.println(pesos.conversion("100.00", libras));
    }
}
