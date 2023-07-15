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
public class Temperatura extends Magnitud {

    private final BigDecimal ratio;
    private final RoundingMode roundingMode;

    public Temperatura(String inRatio) {
        this.ratio = new BigDecimal(inRatio);
        this.roundingMode = RoundingMode.HALF_EVEN;
    }

    public String conversionDespl(String inCantidad, Temperatura inTemperatura, String inDesplazamiento, int inEscala) {
        BigDecimal cantidadBD = new BigDecimal(inCantidad);
        cantidadBD = cantidadBD.multiply(this.ratio);
        cantidadBD = cantidadBD.add(new BigDecimal(inDesplazamiento));
        cantidadBD = cantidadBD.divide(inTemperatura.ratio, this.roundingMode);
        cantidadBD = cantidadBD.setScale(inEscala, this.roundingMode);

        return cantidadBD.toString();
    }
}
