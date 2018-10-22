package ar.edu.unlam.pb2.facturas;

import static org.junit.jupiter.api.Assertions.*;

import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class FacturasTest {

	@Test
	public void agregarFacturas() {
		
		Facturas art1 = new Facturas (5,2.0,false);
		Facturas art2 = new Facturas (1,3.0,false);
		Facturas art3 = new Facturas (1,5.0,true);
		Facturas art4 = new Facturas (2,3.0,true);
		
		Facturas lista = new Facturas();
		
		lista.agregarArticulo(art1);
		lista.agregarArticulo(art2);
		lista.agregarArticulo(art3);
		lista.agregarArticulo(art4);
		
		lista.calcularTotalDeLaFactura();
		
		
		
	}

}
