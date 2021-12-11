package com.ec.edu.inyeccion.dependencias.modelos;

public class CuentaAhorros implements ICuenta {
	private String numAhorro;
	private int monto;
	
	//Setters y Getters
	public String getNumAhorro() {
		return numAhorro;
	}
	public void setNumAhorro(String numAhorro) {
		this.numAhorro = numAhorro;
	}
	public int getMonto() {
		return monto;
	}
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	
	//metodos implementados
	public void calcularDescuento(String s) {
		System.out.println("Se calcula el descuento de " + s);
		
	}
	public void calcularBeneficio() {
		System.out.println("Se calcula el beneficio.....");
		
	}
	
	
	
	
	
	
	
	
}
