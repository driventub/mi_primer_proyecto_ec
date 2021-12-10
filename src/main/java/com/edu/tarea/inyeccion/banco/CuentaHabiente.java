package com.edu.tarea.inyeccion.banco;

public class CuentaHabiente {
	private String nombre, apellido;
	private int cedula;
	private Cuenta cuenta;
	
	
	public CuentaHabiente(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	public String aperCuenta(int numCuenta, int saldo, int valorInteres ) {
		this.cuenta.setNumCuenta(numCuenta);
		this.cuenta.setSaldo(saldo);
		this.cuenta.setValorInteres(valorInteres);
		
		this.cuenta.aperCuenta(valorInteres);
		
		System.out.println(this.cuenta);
		return "Cuenta Generada con Exito";
	}
	//Setters y Getters
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCedula() {
		return cedula;
	}
	public void setCedula(int cedula) {
		this.cedula = cedula;
	}
	
	
}
