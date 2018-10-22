package ar.edu.unlam.pb2.polimorfismo;


public class Persona {

	String nombre;
	
	public Persona (String nombre){
		this.nombre = nombre;
	}
	
	public void saludar() {

		System.out.println("Hola " + nombre + " Sos una fucking persona");
	}
	
	
	public String getNombre(){
		return nombre;
	}
}
