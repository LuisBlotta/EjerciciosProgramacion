package ar.edu.unlam.pb1;



import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PersonaTest {
	Persona pedro = new Persona("Pedro", "Alvarez");
	Persona juan = new Persona("Juan", "Vito");
	Persona hector = new Persona("Hector", "Verga");
	Persona pepe = new Persona("Pepe", "Argento");
	
	
	@Test
	public void test() {
		LinkedList<String> listaDeNombres = new LinkedList<>();
		listaDeNombres.add(pedro.getApellido());
		listaDeNombres.add(juan.getApellido());
		listaDeNombres.add(hector.getApellido());
		listaDeNombres.add(pepe.getApellido());
		System.out.println(listaDeNombres);

	}

}
