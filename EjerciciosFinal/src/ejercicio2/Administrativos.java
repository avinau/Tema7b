package ejercicio2;

import java.util.*;

public class Administrativos extends Persona {

	Scanner teclado = new Scanner(System.in);
	
	String nombre,estudios,ordenador;
	int edad;
	
	public void pedirTodosDatos(){
		System.out.println("Nombre del empleado:");
		nombre=teclado.nextLine();
		super.setNombre(nombre);
		
		System.out.println("Sueldo Base del empleado: "+super.getSueldo());
		
		System.out.println("Edad del empelado: ");
		edad=teclado.nextInt();
		super.setEdad(edad);
		
		System.out.println("Estudios académicos");
		estudios=teclado.nextLine();
		
		System.out.println("Ordenador asignado:");
		ordenador=teclado.nextLine();
		
	}
	
}
