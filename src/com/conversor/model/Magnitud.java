/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.model;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author César Ordaz
 */
public class Magnitud {

    private final BigDecimal ratio;
    private final RoundingMode roundingMode;

    public Magnitud() {
        this.ratio = new BigDecimal("1.0");
        this.roundingMode = RoundingMode.HALF_EVEN;
    }

    public Magnitud(String inRatio) {
        this.ratio = new BigDecimal(inRatio);
        this.roundingMode = RoundingMode.HALF_EVEN;
    }

    public String conversion(String inCantidad, Magnitud inMagnitud, int inEscala) {
        BigDecimal cantidadBD = new BigDecimal(inCantidad);
        cantidadBD = cantidadBD.multiply(this.ratio);
        cantidadBD = cantidadBD.divide(inMagnitud.ratio, this.roundingMode);
        cantidadBD = cantidadBD.setScale(inEscala, this.roundingMode);

        return cantidadBD.toString();
    }
}
