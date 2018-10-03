package ar.edu.unlam.pb2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.compararPersonas.CompararPersonas;

class CompararPersonasTest {

	@Test
	public void compararPersonas() {
		CompararPersonas persona1 = new CompararPersonas("Luis", "Perez", 12345 );
		CompararPersonas persona2 = new CompararPersonas("Luis", "Perez", 12345 );
		
		Boolean valorEsperado = true;
		Boolean valorActual = persona1.equals(persona2);
		
		assertEquals(valorEsperado, valorActual);

	}
	
	@Test
	public void compararHashCode() {
		CompararPersonas persona1 = new CompararPersonas("Luis", "Perez", 12345 );
		CompararPersonas persona2 = new CompararPersonas("Luis", "Perez", 12345 );
		
		int valorEsperado= persona1.hashCode();
		int valorActual = persona2.hashCode();
		
		assertEquals(valorEsperado, valorActual);

	}

}
