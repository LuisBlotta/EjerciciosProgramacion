package ar.edu.unlam.pb2.rectangulos;


import org.junit.Assert;
import org.junit.Test;

public class RectanguloTest {

	@Test
	public void sePuedenCrearRectangulos() {

		Rectangulo primerRectangulo = new Rectangulo(5.5, 4.0);
		Assert.assertNotNull(primerRectangulo);

		Rectangulo segundoRectangulo = new Rectangulo(10.0, 6.0);
		Assert.assertNotNull(segundoRectangulo);
	}

	@Test
	public void elPerimetroDeUnRectanguloDebeSerLaSumaDeLosLados() {
		Rectangulo tercerRectangulo = new Rectangulo(10.0, 5.0);
		Double valorEsperado = 30.0;
		Double valorActual = tercerRectangulo.calcularPerimetro();
		Assert.assertEquals(valorEsperado, valorActual);
	}
	
	@Test
	public void elAreaDeUnRectanguloDebeSerLaBasePorLaAltura() {
		Rectangulo cuartoRectangulo = new Rectangulo (5.0, 4.0);
		Double valorEsperado = 20.0;
		Double valorActual = cuartoRectangulo.calcularArea();
		Assert.assertEquals(valorEsperado, valorActual);
				
	}

}
