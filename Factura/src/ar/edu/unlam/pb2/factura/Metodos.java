package ar.edu.unlam.pb2.factura;

import java.util.List;

public interface Metodos {
	
	public Double totalPorArticulo(); 
	public void agregarArticulos(Factura articulo);
	public Double calcularPrecioTotal();

		
}
