package ar.edu.unlam.pb2.cuenta;

import org.junit.Assert;
import org.junit.Test;

public class CuentaTest {

	@Test
	public void pruebaDeposito() {
		Cuenta cuentaUno = new Cuenta("Juan", 1000.0);
		Double valorEsperado = 1500.0;
		Double valorActual = cuentaUno.depositar(500.0);
		Assert.assertEquals(valorEsperado,valorActual );
		
	} 
	
	@Test
	public void pruebaExtraccion() {
		Cuenta cuentaDos = new Cuenta("Pepe", 1400.0);
		Double valorEsperado = 900.0;
		Double valorActual = cuentaDos.retirar(500.0);
		Assert.assertEquals(valorEsperado,valorActual );
	}
}
