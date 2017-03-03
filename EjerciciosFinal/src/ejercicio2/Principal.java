package ejercicio2;

import java.util.*;

//import ejercicio10.Empleados;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		
		int numEmpleados=0,contador=0,numAdministrativos=0;
		
		System.out.println("Numeros de empleados que desea crear:");
		numEmpleados=teclado.nextInt();
		
		System.out.println("Numero de administrativos que desa crear:");
		numAdministrativos=teclado.nextInt();
		
		Empleados Empleado;
		
		Empleados Empleados[] = new Empleados[numEmpleados];

		while (contador<numEmpleados){
		
		Empleado = new Empleados();									
				
		Empleado.pedirTodosDatos();									//Pedir datos de los empleados									
		
		Empleados[contador] = Empleado;								//Guarda los datos del empleado en el vector
		
		contador++;
		}
		
		contador=0;
		
		
		
		
		
		
		while (contador<numEmpleados){
			
			Empleados[contador].imprimirTodosDatos();
			
			contador++;
		}
		
	}

}
