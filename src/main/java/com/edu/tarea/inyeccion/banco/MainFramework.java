package com.edu.tarea.inyeccion.banco;

import java.util.Random;
import java.util.Scanner;

public class MainFramework {

	public static void main(String[] args) {
		
	Scanner sString = new Scanner(System.in);
	Scanner sInt = new Scanner(System.in);
	
	System.out.println("Ingrese su Nombre");
	String nombre = sString.nextLine();
	
	System.out.println("Ingrese su Apellido");
	String apellido = sString.nextLine();
	
	System.out.println("Ingrese su Cedula");
	int cedula = sInt.nextInt();
	
	System.out.println("Ingrese el Tipo de Cuenta");
	System.out.println("1. Cuenta de Ahorros");
	System.out.println("2. Cuenta Corriente");
	System.out.println("3. Cuenta de Poliza");
	
	int opcion = sInt.nextInt();
	
	Cuenta cuenta ;
	
	if(opcion == 1) {
		 cuenta = new CuentaAhorros();
		 
		 
	}else if(opcion == 2) {
		cuenta = new CuentaCorriente();
		 
	}else if(opcion == 3) {
		cuenta = new CuentaPoliza();
			
		
	}else {
		//Aqui se podria mejorar o cambiar, ya que no hace nada
		cuenta = new Cuenta();
		
	}
	
	
	
	CuentaHabiente c = new CuentaHabiente(cuenta);
	
	//Solo para crear una cuenta de banco aleatoria, sacado de https://stackoverflow.com/questions/5271598/java-generate-random-number-between-two-given-values
	Random r = new Random();
	int low = 1000000000;
	int high = 1999999999 ;
	int result = r.nextInt(high-low) + low; 
	
	
	//Considero que el saldo debe estar quemado
	float saldo = 100;
	//igual, como se repite saldo, podria mejorarse aqui el programa
	String mensaje = c.aperCuenta(result, saldo, saldo);
	System.out.println(mensaje);
	c.setNombre(nombre);
	c.setApellido(apellido);
	c.setCedula(cedula);
	
	
	System.out.println(c);
	System.out.println(cuenta.imprimir());

		}

	
	
	
	}

