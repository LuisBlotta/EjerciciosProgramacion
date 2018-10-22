package ar.edu.unlam.pb2.polimorfismo;

public class Medico extends Persona{

	
	public Medico(String nombre) {
		super(nombre);
		// TODO Auto-generated constructor stub
	}

	public void curar(Persona persona){
		System.out.println("Estas curado ");
	}
	@Override
	public void saludar() {

		System.out.println("Hola " + nombre + " Sos un fucking Medico");
	}

}

