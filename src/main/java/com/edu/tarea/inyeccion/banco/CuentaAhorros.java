package com.edu.tarea.inyeccion.banco;

public class CuentaAhorros extends Cuenta {
	private int descuento;
	
	public void aperCuenta(int valorInteres) {
		System.out.println("Cuenta de Ahorros abierta");
		int res = valorInteres * 10/100;
		System.out.println("El valor del interes para esta cuenta es: " + res);
	}

	public int getDescuento() {
		return descuento;
	}

	public void setDescuento(int descuento) {
		this.descuento = descuento;
	}

//	@Override
//	public String toString() {
//		return "CuentaAhorros [descuento=" + descuento + "]";
//	}
//	
//	
	
}
