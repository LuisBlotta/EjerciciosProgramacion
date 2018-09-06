import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	public void test() {
		int resultado = Calculadora.suma(7, 3);
		int esperado = 10
				;
		
		assertEquals(esperado, resultado);
	}
	
	@Test
	public void test2() {
		int resultado = Calculadora.resta(7, 3);
		int esperado = 4
				;
		
		assertEquals(esperado, resultado);
	}

}
