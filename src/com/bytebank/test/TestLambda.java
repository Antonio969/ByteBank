/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author antoniob
 */
public class TestLambda {
        public static void main(String[] args) {
        
        Cuenta cc1 = new CuentaCorriente(22, 33);
        Cliente clienteCC1 = new Cliente();
        clienteCC1.setNombre("Nico");
        cc1.setTitular(clienteCC1);
        cc1.deposita(333.0);

        Cuenta ca2 = new CuentaAhorros(25, 44);
        Cliente clienteCC2 = new Cliente();
        clienteCC2.setNombre("Guilermo");
        ca2.setTitular(clienteCC2);
        ca2.deposita(444.0);

        Cuenta cc3 = new CuentaCorriente(26, 11);
        Cliente clienteCC3 = new Cliente();
        clienteCC3.setNombre("Paulo");
        cc3.setTitular(clienteCC3);
        cc3.deposita(111.0);

        Cuenta ca4 = new CuentaAhorros(10, 22);
        Cliente clienteCC4 = new Cliente();
        clienteCC4.setNombre("Ana");
        ca4.setTitular(clienteCC4);
        ca4.deposita(222.0);
        
        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(ca2);
        lista.add(cc3);
        lista.add(ca4);
        
        System.out.println(" Antes de ordernar");
        for(Cuenta cuenta: lista){
            System.out.println(cuenta);
        }

        // Usando Lambdas
        lista.sort((Cuenta o1, Cuenta o2) ->
                Integer.compare(o1.getNumero(),o2.getNumero())
        );
          
        System.out.println(" Despues de ordernar");
        for(Cuenta cuenta: lista){
            System.out.println(cuenta);
        }
        
        Collections.sort(lista, (c1,c2) ->
            c1.getTitular().getNombre().compareTo(c2.getTitular().getNombre())
        );
        
        System.out.println(" Ordenamiento nombre titular: ");
        for(Cuenta cuenta: lista){
            System.out.println(cuenta);
        }
        lista.forEach(cuenta -> 
            System.out.println(cuenta)
        );
        
        Collections.sort(lista);
        System.out.println(" Ordenamiento natural: ");
        for(Cuenta cuenta: lista){
            System.out.println(cuenta);
        }
    }
    
}