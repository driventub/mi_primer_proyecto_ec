package com.ec.edu.dependecias;

public class Estudiante {
	protected String nombre;
	protected String apellido;
	protected Direccion direccion;

	
	
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + "El estudiante hace el pago");
		System.out.println(nombre + "El estudiante presenta el pago");
		System.out.println("TARJETA");
		
	}
	
	
	// Setters y Getters

	
	public String getNombre() {
		return nombre;
	}
	
	

	public Direccion getDireccion() {
		return direccion;
	}



	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
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



	@Override
	public String toString() {
		return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + "]";
	}
	
	
}
