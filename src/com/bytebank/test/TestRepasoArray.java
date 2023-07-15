/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author antoniob
 */
public class TestRepasoArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        
        int numero = 40;
        // WRAPER
        // Integer numeroObjeto = new Integer(40); deprecado
        Integer numeroObjeto = Integer.valueOf(40);
        
        
        List lista = new ArrayList();
        // primitivo != object
        lista.add(numero); // autoboxing
        lista.add(numeroObjeto);
        
        // unboxing
        int vlorPrimitivo = numeroObjeto.intValue();
        
        byte byteInteger = numeroObjeto.byteValue();
        double doubleInteger = numeroObjeto.doubleValue();
        float floatInteger = numeroObjeto.floatValue();
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        
        System.out.println(Integer.SIZE);  // bits
        System.out.println(Integer.BYTES); // 4
        // 
    }
}
