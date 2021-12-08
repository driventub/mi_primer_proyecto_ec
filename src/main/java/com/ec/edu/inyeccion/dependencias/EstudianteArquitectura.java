package com.ec.edu.inyeccion.dependencias;

public class EstudianteArquitectura extends Estudiante{
	
	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + "El estudiante hace el pago");
		System.out.println(nombre + "El estudiante presenta el pago odonto ");
		System.out.println("efectivo");
		
	}
	
	private int idMunicipio;

	public int getIdMunicipio() {
		return idMunicipio;
	}

	public void setIdMunicipio(int idMunicipio) {
		this.idMunicipio = idMunicipio;
	}
	
	
}
