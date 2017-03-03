package ejercicio2;

import java.util.*;

public class Administrativos extends Persona {

	Scanner teclado = new Scanner(System.in);
	
	String nombre,estudios,ordenador;
	int edad;
	
	public void pedirTodosDatos(){
		System.out.printle();
		Systn("Nombre del administrativo:");
		nombre=teer.setNombre(nombre);
		
		System.out.println("Sueldo base del administrativo: "+super.getSueldo());
		
		System.out.pcladoxtInt();.nextLine();
		suprintln("Edad del empelado: ");
		edad=teclado.ne
		super.setEdad(edad);
		teclado.nextLinem.out.println("Estudios académicos");
		estudios=teclado.nextLine();
		
		System.out.println("Ordenador asignado:");
		ordenador=teclado.nextLine();
		
	}

public void imprimirTodosDatos(){
		
		System.out.println("Nombre: "+super.getNombre());
		System.out.println("Edad: "+super.getEdad());
		System.out.println("Sueldo base: "+super.getSueldo());
		System.out.println("Estudios académicos: "+estudios);
		System.out.println("Ordenador asignado: "+ordenador);
	}
	
}
