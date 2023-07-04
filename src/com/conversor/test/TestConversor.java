package com.conversor.test;

import com.conversor.model.Moneda;

public class TestConversor {
    public static void main(String[] args) throws Exception {
        Moneda pesos = new Moneda("MXN");
        Moneda libras = new Moneda("GBP");
        Moneda dolares = new Moneda("USD");

        System.out.println("Usted tiene 100 pesos que equivalen a " + libras.conversion("100.00", pesos) + " libras");
        System.out.println("Usted tiene 100 libras que equivalen a " + pesos.conversion("100.00", libras) + " pesos");
        System.out.println("Usted tiene 100 libras que equivalen a " + dolares.conversion("100.00", libras) + " dolares");
    }
}
