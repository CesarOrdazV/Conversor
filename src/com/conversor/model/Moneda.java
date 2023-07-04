package com.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moneda {
    private BigDecimal ratio = BigDecimal.valueOf(1.0);
    private RoundingMode rm = RoundingMode.HALF_EVEN;

    public Moneda(String ratio) {
        BigDecimal ratioBD = new BigDecimal(ratio);
        BigDecimal ceroBD = new BigDecimal("0.0");

        if (ratioBD.compareTo(ceroBD) != 0) {
            this.ratio = ratioBD;
        } else {
            System.err.println("¡Error! El ratio no puede ser cero.");
        }
    }

    public String conversion(String monto, Moneda monedaDestino) {
        BigDecimal montoBD = new BigDecimal(monto);
        montoBD = montoBD.divide(monedaDestino.ratio, rm).multiply(ratio).setScale(2, rm);

        return montoBD.toString();
    }
}