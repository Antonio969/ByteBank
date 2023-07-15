/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

/**
 *
 * @author antoniob
 */
public class TestWrappers {
    public static void main(String[] args) {
        Double numeroDoble = 33.0; // Autoboxing
        Boolean verdadero = true; // Autoboxing
        
        Double numeroDoble2 = Double.valueOf(33);
        System.out.println(numeroDoble2);
        
        String numeroString = "43";
        
        Double stringToDouble = Double.valueOf(numeroString);
        Integer stringToInteger = Integer.valueOf(numeroString);
        
        System.out.println(stringToDouble);
        System.out.println(stringToInteger);
        
        Number numero = Integer.valueOf(5);
        double numeroDoublePrim = numero.doubleValue();
        
        Boolean falso = Boolean.FALSE;
        
    }
    
}
