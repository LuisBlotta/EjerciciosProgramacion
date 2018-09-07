package ar.edu.unlam.pb2.cerraduraTest;

import org.junit.Test;

import ar.edu.unlam.pb2.cerradura.Cerradura;


import org.junit.Assert;


public class CerraduraTest {

	
	
	@Test
	public void bloquearCerradura() {
		Cerradura cerradura1 = new Cerradura();	
		 cerradura1.ingresarContraseña("Cerradura12345");
		 cerradura1.ingresarContraseña("Cerradura12345");
		 cerradura1.ingresarContraseña("Cerradura12345");				
		 Assert.assertTrue(cerradura1.cerraduraBloqueada());
		 Assert.assertFalse(cerradura1.comprobarEstadoCerradura());
						
	}
	
	@Test
	public void coincidenciaPass() {
		
		Cerradura cerradura2 = new Cerradura();
		Assert.assertEquals(cerradura2.getPassword(), cerradura2.ingresarContraseña("Cerradura123"));
		 Assert.assertTrue(cerradura2.comprobarEstadoCerradura());
		 Assert.assertFalse(cerradura2.cerraduraBloqueada());


		
		}
	
}

