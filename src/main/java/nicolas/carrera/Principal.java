package nicolas.carrera;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal {

	public static void main(String[] args) {
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");

		// Estudiante
		Estudiante est = (Estudiante)app.getBean("estudiante");
		System.out.println("Nombre estudiante: " + est.getNombre() + " Apellido: " + est.getApellido() + " Edad: " + est.getEdad());
		
		// Profesor
		Profesor prf = (Profesor)app.getBean("profesor");
		System.out.println("Nombre profesor: " + prf.getNombre() + " Apellido: " + prf.getApellido() + " Profesion: " + prf.getProfesion() + " Universidad: " + prf.getUnivarsidad());
	}
}
