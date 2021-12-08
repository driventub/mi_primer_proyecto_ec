package com.ec.edu.dependecias;

public class EstudiantesAdministracion extends Estudiante{
	private String niffContabilidad;

	public void pagarServiPagos(String nombre) {
		System.out.println(nombre + "El estudiante hace el pago");
		System.out.println(nombre + "El estudiante presenta el pago");
		System.out.println("paypal");
		
	}
	
	
	
	public String getNiffContabilidad() {
		return niffContabilidad;
	}

	public void setNiffContabilidad(String niffContabilidad) {
		this.niffContabilidad = niffContabilidad;
	}
	
	
}
