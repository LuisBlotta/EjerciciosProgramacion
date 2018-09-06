package ar.edu.unlam.pb2.persona;

import org.junit.Assert;
import org.junit.Test;

public class PersonaTest {

	@Test
	public void ComprobarSiEstaDebajoDeSuPesoIdeal() {
		
		Persona persona1 = new Persona ("Juan", "11/10/1985", 21, 38851098, 'M', 45.0, 1.75);
		Double valorActual= persona1.calcularIMC();
		Double valorEsperado = -1.0;
		
		Assert.assertEquals(valorEsperado, valorActual);
		}
	
	@Test
	public void ComprobarPesoIdeal() {
		
		Persona persona1 = new Persona ("Juan", "11/10/1985", 21, 38851098, 'H', 75.0, 1.75);
		Double valorActual= persona1.calcularIMC();
		Double valorEsperado = 0.0;
		
		Assert.assertEquals(valorEsperado, valorActual);
		}
	
	
	
	@Test
	public void ComprobarSiTieneSobrepeso() {
		
		Persona persona1 = new Persona ("Juan", "11/10/1985", 21, 38851098, 'H', 95.0, 1.75);
		Double valorActual= persona1.calcularIMC();
		Double valorEsperado = 1.0;
		
		Assert.assertEquals(valorEsperado, valorActual);
		}
	
	@Test
	public void comprobarSiEsMayor() {
		Persona persona2 = new Persona ("Juan", "21/11/1995", 25, 38851098, 'H', 45.0, 1.75);
		Boolean valorActual = persona2.esMayorDeEdad();
		
		Assert.assertTrue(valorActual);

	}
	

 
	@Test
	public void testIgualdadDeObjetos() {
		
		String cadena1 = new String ("cadena");
		String cadena2 = new String ("cadena");
		Assert.assertTrue(cadena1 == cadena2);
	}
}
