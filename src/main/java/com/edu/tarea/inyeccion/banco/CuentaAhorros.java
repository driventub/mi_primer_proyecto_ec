package com.edu.tarea.inyeccion.banco;

public class CuentaAhorros extends Cuenta {
	private float descuento;
	
	public void aperCuenta(float valorInteres) {
		System.out.println("Cuenta de Ahorros abierta");
		float res = valorInteres * 10/100;
		System.out.println("El valor del interes para esta cuenta es: " + res);
	}

	public float getDescuento() {
		return descuento;
	}

	public void setDescuento(float descuento) {
		this.descuento = descuento;
	}

//	@Override
//	public String toString() {
//		return "CuentaAhorros [descuento=" + descuento + "]";
//	}
//	
//	
	
}
