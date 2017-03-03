package ejercicio2;

import java.util.*;

public class Empleados extends Persona{

	Scanner teclado=new Scanner (System.in);
	String nombre;
	int edad;
	
	
	
	public void pedirTodosDatos(){
		System.out.println("Nombre del empleado:");
		nombre=teclado.nextLine();
		super.setNombre(nombre);
		
		System.out.println("Sueldo Base del empleado: "+super.getSueldo());
		
		System.out.println("Edad del empelado: ");
		edad=teclado.nextInt();
		super.setEdad(edad);
		
	}
	
	public void imprimirTodosDatos(){
		
		System.out.println("Nombre: "+super.getNombre());
		System.out.println("Edad: "+super.getEdad());
		System.out.println("Sueldo base: "+super.getSueldo());
	}
	
	
}
