package ar.edu.unlam.pb2.subasta;

import org.junit.Test;

import org.junit.Assert;

public class SubastaTest {

	@Test
	public void testQueLaSubastaSeCreaAbierta() {

		// 1.Reparacion
		Integer valorInicial = 1;
		Subasta miSubasta = new Subasta(valorInicial);
		Boolean valorEsperado = false;
		// 2.Ejecución

		Boolean valorObtenido = miSubasta.estadoSubasta();

		// 3.Contrastación
		Assert.assertEquals(valorEsperado, valorObtenido);

	}
	
	@Test
	public void testQueAlCerrarlaSeCierreConLaOfertaMasAlta(){
		

		Subasta miSubasta = new Subasta(1);
		Integer valorEsperado = 1000;
		miSubasta.ofertar(100);
		miSubasta.ofertar(500);
		miSubasta.ofertar(1000);
		miSubasta.ofertar(400);
		Integer valorObtenido = miSubasta.cerrar();
		Assert.assertEquals(valorEsperado, valorObtenido);
		System.out.println(valorObtenido);

		
		
	}

}
