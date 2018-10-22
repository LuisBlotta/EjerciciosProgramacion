package ar.edu.unlam.pb2.facturas;

public interface InterfaceFacturas {

	public Double calcularPrecioPorArticulo();
	public void agregarArticulo(Facturas articulo);
	public void calcularTotalDeLaFactura();
	
}
