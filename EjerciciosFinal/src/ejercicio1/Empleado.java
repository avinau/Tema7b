package ejercicio1;

import java.util.*;

public class Empleado implements Persona {

	private static String nombre;

	public static void pedirTodosDatos() {

		Scanner teclado=new Scanner (System.in);
		System.out.println("Nombre del empleado:");
		Empleado.nombre=teclado.nextLine();

		System.out.println("Nombre de la empresa:" +Persona.nombreEmpresa);
	}

	public static void visualizarTodosDatos() {
		// TODO Auto-generated method stub

		System.out.println("Nombre del empleado: "+Empleado.nombre);
		System.out.println("Nombre de la empresa:" +Persona.nombreEmpresa);

	}

}
