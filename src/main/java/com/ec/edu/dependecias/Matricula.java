package com.ec.edu.dependecias;

public class Matricula {
	
	private String semestre;
	private int anho;
	private Estudiante estudiante;
	
	
	
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
		this.estudiante = new Estudiante();
		this.estudiante.setNombre(nombre);
		this.estudiante.setApellido(apellido);
		
		Direccion direccion = new Direccion();
		direccion.setCallePrincipal(calle);
		direccion.setNumeracion(semestre);
		
		this.estudiante.setDireccion(direccion);
		
		
		
		
		//logica para guardar los datos de la matricula
		//y el estudiante
		
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
