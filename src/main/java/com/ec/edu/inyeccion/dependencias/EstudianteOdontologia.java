package com.ec.edu.inyeccion.dependencias;

public class EstudianteOdontologia extends Estudiante {
	
	
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + "El estudiante hace el pago");
		System.out.println(nombre + "El estudiante presenta el pago odonto ");
		
		
	}
	
	//Setters y Getterss
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
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	
}
