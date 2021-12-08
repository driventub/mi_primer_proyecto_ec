package com.ec.edu.inyeccion.dependencias;

public class Matricula {
	
	private String semestre;
	private int anho;
	private Estudiante estudiante;
	private Direccion direccion;
	
	public Matricula(Estudiante estudiante, Direccion direccion) {
		this.estudiante = estudiante;
		this.direccion = direccion;
		
		
		

	}
	
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public String getSemestre() {
		return semestre;
	}

	public void setSemestre(String semestre) {
		this.semestre = semestre;
	}

	public int getAnho() {
		return anho;
	}

	public void setAnho(int anho) {
		this.anho = anho;
	}

	public String matricular(String nombre, String apellido, String calle, String numero) {
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(semestre);
		
		this.estudiante.setDireccion(direccion);
		
		System.out.println(this.estudiante);
		
		return "Estudiante Guardado con Exito";
	}

	public Estudiante getEstudiante() {
		return estudiante;
	}

	public void setEstudiante(Estudiante estudiante) {
		this.estudiante = estudiante;
	}

}
