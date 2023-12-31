package com.bytebank.test;

import java.util.ArrayList;

import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;
import java.util.LinkedList;
import java.util.List;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// <> Forzando a que acepte solo un tipo de objeto
		List<Cuenta> lista = new ArrayList<Cuenta>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		
		lista.add(cc);
		lista.add(cc2);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Cuenta obtenerCuenta = lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		// Por cada cuenta : lista
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		// Por referencia
                if (contiene) {
			System.out.println("Si es igual (equals)");
		}
                // Por valores
                if(cc.esIgual(cc3)){
                    System.out.println("Si, son iguales");
                }
                
                
                    
                
		
	}

}
