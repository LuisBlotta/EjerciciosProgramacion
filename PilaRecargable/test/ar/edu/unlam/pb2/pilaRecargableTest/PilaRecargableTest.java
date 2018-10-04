package ar.edu.unlam.pb2.pilaRecargableTest;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.pilaRecargable.PilaRecargable;

public class PilaRecargableTest {

	@Test	
	public void pila() {
		
		PilaRecargable duracell = new PilaRecargable(5, 2);
		
		duracell.cargar(10);
		Integer esperado = 50;
		assertEquals(esperado, duracell.medirCarga());
		
		
		duracell.consumir(5);
		Integer esperado2 = 40;
		assertEquals(esperado2, duracell.medirCarga());

		duracell.cargar(100);
		duracell.cargar(100);
		duracell.cargar(100);
		duracell.cargar(100);
		Integer esperado3 = 4;
		assertEquals(esperado3, duracell.getCargasTotales());

		
		duracell.consumir(5);
		duracell.consumir(15);
		Integer esperado4 = 60;
		assertEquals(esperado4, duracell.medirCarga());

		duracell.getMedirConsumoTotal();
		Integer esperado5 = 25;
		assertEquals(esperado5, duracell.getMedirConsumoTotal());

	}
	
	@Test
	public void compararPilasEquals() {
		PilaRecargable pila1 = new PilaRecargable(5,8);
		PilaRecargable pila2 = new PilaRecargable(5,9);
		
		Boolean valorEsperado = true;
		
	assertEquals(valorEsperado, pila1.equals(pila2));		
	}
	@Test
	public void compararPilasHashCode() {
		PilaRecargable pila1 = new PilaRecargable("pedro");
		PilaRecargable pila2 = new PilaRecargable("pedro");
		
		
	assertEquals(pila1.hashCode(), pila2.hashCode());		
	}
	
	
}
