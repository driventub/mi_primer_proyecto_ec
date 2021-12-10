package com.edu.tarea.inyeccion.banco;

import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		
//		 Scanner sString = new Scanner(System.in);
	Cuenta cuenta;
	
	cuenta = new CuentaAhorros();
	
	CuentaHabiente c = new CuentaHabiente(cuenta);
	
	String mensaje = c.aperCuenta(2, 100, 100);
	System.out.println(mensaje);
	c.setNombre("Paulo");
	c.setApellido("Aldaz");
	c.setCedula(0);
	
	System.out.println(c);
	
	}

}
