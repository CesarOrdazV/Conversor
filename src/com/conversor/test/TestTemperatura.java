/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.conversor.test;

import com.conversor.model.Temperatura;

/**
 *
 * @author César Ordaz
 */
public class TestTemperatura {
    public static void main(String[] args) {
        Temperatura celsius = new Temperatura("1.0");
        Temperatura fahrenheit = new Temperatura("1.8");
        Temperatura kelvin = new Temperatura("1.0");
        
        System.out.println(celsius.conversionDespl("55.42", fahrenheit, "-32.0", 2));
        System.out.println(fahrenheit.conversionDespl("55.42", celsius, "32.0", 2));
        System.out.println(celsius.conversionDespl("55.42", kelvin, "-273.15", 2));
        System.out.println(kelvin.conversionDespl("55.42", celsius, "273.15", 2));
        System.out.println(fahrenheit.conversionDespl("55.42", kelvin, "-459.67", 2));
        System.out.println(kelvin.conversionDespl("55.42", fahrenheit, "459.67", 2));
    }
}
