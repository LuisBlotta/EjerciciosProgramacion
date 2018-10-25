package ar.edu.unlam.pb2.facturaTest;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import ar.edu.unlam.pb2.factura.*;

class FacturaTest {

	@Test
	
	public void crearProducto() {
		
		Factura factura1 = new ImprimirPdf();

		Detalles detalles = new Detalles();

		Factura art1 = new Articulo(2.0, 10.0);
		Factura art2 = new ArticuloDeLujo(3.0, 7.0);
		
		detalles.agregarArticulos(art1);
		detalles.agregarArticulos(art2);

		factura1.imprimir();
	
	}
	}
