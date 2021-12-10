package com.edu.tarea.inyeccion.banco;

public class CuentaCorriente extends Cuenta{
	
	private int montoMinimo;
	
	public void aperCuenta(float valorInteres) {
		System.out.println("Cuenta de Ahorros abierta");
		float res = valorInteres * 8/100;
		System.out.println("El valor del interes para esta cuenta es: " + res);
	}
	
	
	public int getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(int montoMinimo) {
		this.montoMinimo = montoMinimo;
	}


	@Override
	public String toString() {
		return "CuentaCorriente [montoMinimo=" + montoMinimo + "]";
	}

	
	
	
}
