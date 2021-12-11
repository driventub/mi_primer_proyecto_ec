package com.ec.edu.inyeccion.dependencias.modelos;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		
		System.out.println("Ingrese Tipo: ");
		int tipo = scannerInt.nextInt();
		ICuenta cuenta = null;
		if(tipo ==1) {
			cuenta  = new CuentaCorriente();
		}else if(tipo == 2) {
			cuenta = new CuentaAhorros();
		}else  if(tipo == 3) {
			cuenta = new CuentaFuturo();
		
		}
		
		
		GestorCuentas gestor = new GestorCuentas(cuenta);
		gestor.registrarCuentaHabiente();
		
		
	}

}
