package com.ec.edu.inyeccion.dependencias;

import java.util.Scanner;



public class MainFramework {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Scanner scannerInt = new Scanner(System.in);
		System.out.println("Ingrese Nombre");
		String nombre = scanner.nextLine();
		
		System.out.println("Ingrese Apellido");
		String apellido = scanner.nextLine();
		
		System.out.println("Ingrese Calle");
		String calle = scanner.nextLine();
		
		
		System.out.println("Ingrese Numeracion");
		String num = scanner.nextLine();
		
		System.out.println("Ingrese Tipo");
		int tipo = scannerInt.nextInt();
		
		Estudiante estudiante;
		if(tipo == 1) {
			estudiante = new Estudiante();
		}else if(tipo == 2) {
			estudiante = new EstudianteArquitectura();
		}else if(tipo == 3) {
			estudiante = new EstudianteOdontologia();
			
		}else {
			estudiante = new EstudiantesAdministracion();
		}

		Matricula matricula = new Matricula(new Estudiante(),new Direccion());
		matricula.setAnho(2015);
		matricula.setSemestre("Sexto");
		
		matricula.matricular(nombre, apellido, calle, num);

	}

}
