package com.edu.tarea.inyeccion.banco;

public class Cuenta {
	protected int numCuenta;
	protected float saldo, valorInteres;
	
	public void aperCuenta(float valorInteres) {
		
	}
	//Getters y Setters
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public float getValorInteres() {
		return valorInteres;
	}
	public void setValorInteres(float valorInteres) {
		this.valorInteres = valorInteres;
	}
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo +  "]";
	}
	
	
}
