package com.edu.tarea.inyeccion.banco;

public class Cuenta {
	protected int numCuenta,saldo, valorInteres;
	
	public void aperCuenta(int valorInteres) {
		
	}
	//Getters y Setters
	public int getNumCuenta() {
		return numCuenta;
	}
	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getValorInteres() {
		return valorInteres;
	}
	public void setValorInteres(int valorInteres) {
		this.valorInteres = valorInteres;
	}
	@Override
	public String toString() {
		return "Cuenta [numCuenta=" + numCuenta + ", saldo=" + saldo +  "]";
	}
	
	
}
