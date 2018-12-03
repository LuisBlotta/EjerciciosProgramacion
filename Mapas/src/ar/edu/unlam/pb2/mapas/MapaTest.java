package ar.edu.unlam.pb2.mapas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.*;

import org.junit.jupiter.api.Test;

class MapaTest {

	@Test

	public void cuentaTodasLasLetras() {
		Mapas mapita = new Mapas();
		Map<Character, Integer> resultado = mapita.crearMapa("ABC");
		assertEquals(3, resultado.size());

	}

	@Test

	public void agrupaLasLetras() {
		Mapas mapita = new Mapas();

		Map<Character, Integer> resultado = mapita.crearMapa("perro");
		assertEquals(1, resultado.get('p').intValue());

		assertEquals(1, resultado.get('e').intValue());

		assertEquals(2, resultado.get('r').intValue());

		assertEquals(1, resultado.get('o').intValue());
	}
	
	@Test
	
	public void mapaDeClientes() {
		
		Mapas mapita = new Mapas();
		
		Map <Integer, String> mapa1 = new TreeMap <>();
		
		mapa1.put(45, "Pedro");
		mapa1.put(5, "Juan");
		mapa1.put(3, "Lucas");
		mapa1.put(4, "Pedro");
		mapa1.put(55, "Lucas");
		mapa1.put(65, "Mauro");
		mapa1.put(47, "Pedro");
	
		Map <String, Integer> otroMapa = mapita.listaClientes(mapa1);
	
		assertEquals(4, otroMapa.size());
		
		assertEquals((Integer)3,otroMapa.get("Pedro"));
		assertEquals((Integer)2,otroMapa.get("Lucas"));
		assertEquals((Integer)1,otroMapa.get("Juan"));
		
		assertTrue(otroMapa.containsKey("Mauro"));
	
	System.out.println(otroMapa);
	}
	
	
	
}
