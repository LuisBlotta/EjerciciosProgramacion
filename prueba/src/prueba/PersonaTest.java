package prueba;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class PersonaTest {

	@Test
	public void listaClientes() {
		Persona p1 = new Persona (41, "Pedro");
		Persona p2 = new Persona (4, "Juan");
		Persona p3 = new Persona (31, "Lucas");
		Persona p4 = new Persona (1, "Lucas");
		Persona p5 = new Persona (441, "Pedro");
		Persona p6 = new Persona (81, "Pedro");
		Persona p7 = new Persona (19, "Mauro");
		Persona p8 = new Persona (88, "Hector");

		Map <Integer, Persona> mapaInicial = new HashMap<>();
		mapaInicial.put(p1.getId(), p1);
		mapaInicial.put(p2.getId(), p2);
		mapaInicial.put(p3.getId(), p3);
		mapaInicial.put(p4.getId(), p4);
		mapaInicial.put(p5.getId(), p5);
		mapaInicial.put(p6.getId(), p6);
		mapaInicial.put(p7.getId(), p7);
		mapaInicial.put(p8.getId(), p8);

		Map<String, Integer> mapaFinal = p1.listaClientes(mapaInicial);
		System.out.println(mapaFinal);
		assertTrue(mapaFinal.containsValue(3));
		assertEquals((Integer)3, mapaFinal.get("Pedro"));
		assertEquals (5, mapaFinal.size());
		assertTrue(mapaFinal.containsKey("Mauro"));
	}

}
