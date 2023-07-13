package com.conversor.test;

import com.conversor.model.Moneda;
import com.excepcion.Excepcion;

public class TestConversor {
    public static void main(String[] args) throws Excepcion {
        Moneda pesos = new Moneda("MXN");
        Moneda libras = new Moneda("GBP");
        Moneda dolares = new Moneda("USD");

        System.out.print(libras.conversion("1.00", pesos) + "\n");
        System.out.print(pesos.conversion("1.00", libras) + "\n");
        System.out.print(dolares.conversion("1.00", libras) + "\n");
    }
}
