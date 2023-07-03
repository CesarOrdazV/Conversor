package com.conversor.test;

import com.conversor.model.Moneda;

public class TestConversor {
    public static void main(String[] args) {

        Moneda pesos = new Moneda(17.0639);
        Moneda dolares = new Moneda(1.0);

        System.out.println(dolares.conversion(34.13, pesos));
        System.out.println(dolares.conversion("34.13", pesos));

        System.out.println(pesos.conversion(100, dolares));
        System.out.println(pesos.conversion("100", dolares));
    }
}
