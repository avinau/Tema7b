package ejercicio2;

public abstract class Persona {

	private	String nombre;
	private	int sueldob;
	private	int edad;

	public void setNombre(String nombre){
		
		this.nombre=nombre;
	}
	
	public void setEdad(int edad){
		
		this.edad=edad;
	}
	
	public String getNombre(){
		
		return nombre;
	}
	
	public int getSueldo(){
		
		return sueldob;
	}
	
	public int getEdad(){
		
		return edad;
	}
}
