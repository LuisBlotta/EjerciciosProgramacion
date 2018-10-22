package ar.edu.unlam.pb2.polimorfismo;


public class Estudiante extends Persona {

	public Estudiante(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public void darPresente() {

		System.out.println("Presente");
	}
	@Override
	public void saludar() {

		System.out.println("Hola " + nombre + " Sos un fucking estudiante");
	}

}
