package Ejercicio1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReverseTest {

	@Test
	public void comparacion() {
		String palindromo = "anita lava la tina";
		palindromo = palindromo.replaceAll(" ", "");
		
		StringBuilder builder = new StringBuilder(palindromo);	
		String palindromoAlReves = builder.reverse().toString();
		System.out.println(palindromo + " es igual a " + palindromoAlReves);
		
		assertEquals(palindromo, palindromoAlReves);
		
	}
	
	
	@Test
	public void contiene() {
		String frase = "Do, or do not. There is no try";
        String contiene = "There";
        String noContiene = "Yoda";
        
        assertTrue(frase.contains(contiene));
        assertFalse(frase.contains(noContiene));
        
	}



	@Test
	public void largo() {
		
		String indiana = "Henry Jones Junior";
		int cantidadDeLetras = indiana.length();
		assertEquals(18,cantidadDeLetras);
	}


	
	@Test
	public void posiciones() {
		
		String palabra = "Otorrinolariingólogo";
		int posicionPrimeraI = 0;
		int posicionSegundaI = 0;
		int posicionTerceraI = 0;

		posicionPrimeraI = palabra.indexOf("i");
		posicionSegundaI = palabra.indexOf("i", posicionPrimeraI +1);
		posicionTerceraI = palabra.indexOf("i", posicionSegundaI +1);

		assertEquals(5, posicionPrimeraI);
		assertEquals(11, posicionSegundaI);
		assertEquals(12, posicionTerceraI);

		
	}
	
	
		


}
