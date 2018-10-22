package ar.edu.unlma.pb2.polimorfismoTest;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb2.polimorfismo.Congreso;
import ar.edu.unlam.pb2.polimorfismo.Estudiante;
import ar.edu.unlam.pb2.polimorfismo.Medico;
import ar.edu.unlam.pb2.polimorfismo.Persona;

public class PolimorfismoTest {

	// Polimorfismo
	@Test
	public void test() {
		Persona persona1 = new Persona("Juan");
		Persona persona2 = new Estudiante("pedro"); // (Asignacion polimorfica)
													// solo va a tener los
													// metodos y atributos del
													// padre (clase padre a la
													// izquierda, clase hijo a
													// la derecha)
		Estudiante estudiante1 = new Estudiante("Lucas");
		// Estudiante estudiante2 = (Estudiante) new Persona("bob"); No compila,
		// una clase padre no puede sustituir a una hijo.

		persona2.saludar();

		Medico drMario = new Medico("Roberto");
		Medico otromedico = new Medico("Josesito");

		drMario.curar(persona1);
		drMario.curar(estudiante1);
		drMario.curar(otromedico);
		drMario.curar(drMario);

		// Entidades polimórficas
		Congreso congreso1 = new Congreso();

		congreso1.agregarAsistente(persona1);
		congreso1.agregarAsistente(persona2);
		congreso1.agregarAsistente(drMario);
		congreso1.saludarATodos();

		// Dynamic Binding
		persona1.saludar();
		persona2.saludar();
		estudiante1.saludar();
		
		Estudiante estudiante2 = (Estudiante) persona2;
		estudiante2.darPresente();
		

	}

}
