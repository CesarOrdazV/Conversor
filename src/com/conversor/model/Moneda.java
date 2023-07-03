package com.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Moneda {
    private BigDecimal ratio = BigDecimal.valueOf(1.0);
    private RoundingMode rm = RoundingMode.HALF_EVEN;
    
    public Moneda(double ratio) {
        if (ratio != 0.0) {
            this.ratio = BigDecimal.valueOf(ratio);
        } else {
            System.err.println("¡Error! El ratio no puede ser cero.");
        }
    }

    public Moneda(String ratio) {
        BigDecimal ratioBD = new BigDecimal(ratio);
        BigDecimal ceroBD = new BigDecimal("0.0");

        if (ratioBD.compareTo(ceroBD) != 0) {
            this.ratio = ratioBD;
        } else {
            System.err.println("¡Error! El ratio no puede ser cero.");
        }
    }

    public double conversion(double monto, Moneda monedaDestino) {
        BigDecimal montoBD = BigDecimal.valueOf(monto);
        montoBD = montoBD.divide(monedaDestino.ratio, rm).multiply(ratio).setScale(2);

        return montoBD.doubleValue();
    }

    public String conversion(String monto, Moneda monedaDestino) {
        BigDecimal montoBD = new BigDecimal(monto);
        montoBD = montoBD.divide(monedaDestino.ratio, rm).multiply(ratio).setScale(2);

        return montoBD.toString();
    }
}