package com.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

import com.conversor.connection.URLReader;
import com.excepcion.Excepcion;

public class Moneda {
    private BigDecimal ratio;
    private RoundingMode rm = RoundingMode.HALF_EVEN;

    public Moneda(String codigoMoneda) throws Excepcion {
        URLReader reader = new URLReader();
        ratio = new BigDecimal(reader.getRatio(codigoMoneda));
    }

    public String conversion(String monto, Moneda monedaDestino) {
        BigDecimal montoBD = new BigDecimal(monto);

        montoBD = montoBD.divide(monedaDestino.ratio, rm).multiply(ratio).setScale(2, rm);

        return montoBD.toString();
    }
}