package ar.edu.unlam.pb2.facturas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class FacturasTest {

	@Test
	public void agregarFacturas() {
		
		Facturas fact1 = new Facturas();
		
		Facturas art1 = new Facturas(5, 5.0, false);
		Facturas art2 = new Facturas(5, 5.0, false);

		fact1.agregarArticulo(art1);
		fact1.agregarArticulo(art2);
		
		fact1.calcularTotalDeLaFactura();
	}	
		@Test
		public void agregarFacturas2() {
		Facturas fact2 = new Facturas();
		
		Facturas art3 = new Facturas(2, 5.0, false);
		Facturas art4 = new Facturas(2, 5.0, false);

		fact2.agregarArticulo(art3);
		fact2.agregarArticulo(art4);
		
		fact2.calcularTotalDeLaFactura();
		
	}


}
