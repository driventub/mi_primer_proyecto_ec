package com.ec.inyeccion.dependencias.framework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		ApplicationContext app = new ClassPathXmlApplicationContext("com/uce/edu/archivo/beans.xml");
		app.getBean("cuenta");
		Cuenta miCuenta = (Cuenta) app.getBean("cuenta");
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());
		
//		Codigo Acoplado
//		Cuenta miCuentaPrueba = new Cuenta();
//		miCuentaPrueba.setNumero(2);
//		Cuenta miCuentaPrueba2 = new Cuenta("1234",100);
		
		Cuenta miCuenta1 = (Cuenta) app.getBean("cuenta1");
		System.out.println(miCuenta.getNumero());
		System.out.println(miCuenta.getSaldo());
		
//		app.getBean(Cuenta.class);
		
		//IoC por Constructor
		
		Estudiante estu = (Estudiante)app.getBean("estu");
		int res = estu.getEdad() + 10;
		System.out.println(estu.getNombre() + " "+ estu.getApellido() + " " + res );
		
	}

}
