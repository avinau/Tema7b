package ejercicio1;

import java.util.*;

public class Cliente implements Persona{

	private static String nombre;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}
	
	public static void pedirTodosDatos() {
		
		Scanner teclado=new Scanner (System.in);
		System.out.println("Nombre del nuevo Cliente:");
		Cliente.nombre=teclado.nextLine();
		
		System.out.println("Nombre de la empresa:" +Persona.nombreEmpresa);
	}

	public static void visualizarTodosDatos() {
		// TODO Auto-generated method stub
		
		System.out.println("Nombre del cliente: "+Cliente.nombre);
		System.out.println("Nombre de la empresa:" +Persona.nombreEmpresa);
		
	}

}
