package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaCorriente implements ICuenta {
	private float montoMinimo;
	//Setters y Getters
	public float getMontoMinimo() {
		return montoMinimo;
	}

	public void setMontoMinimo(float montoMinimo) {
		this.montoMinimo = montoMinimo;
	}

	public void calcularDescuento(String s) {
		System.out.println("Calculando descuento corriente");
		
	}

	public void calcularBeneficio() {
		System.out.println("Calculando beneficio corriente");
		
	}
	

	
	
	
	
}
