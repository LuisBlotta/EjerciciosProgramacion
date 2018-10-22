package ar.edu.unlam.pb2.facturas;

import java.util.LinkedList;

public class Facturas implements InterfaceFacturas {

	protected Integer cantidad;
	protected Double precio;
	protected Double precioTotalPorArticulo;
	protected Boolean esBebidaOPerfume;
	protected Double precioTotal = 0.0;
	private final Double IMPUESTOGENERAL = 0.21;
	private final Double IMPUESTOBEBIDAYPERFUME = 0.36;

	public Facturas() {
	}

	public Facturas(Integer cantidad, Double precio, Boolean esBebidaOPerfume) {
		this.cantidad = cantidad;
		this.precio = precio;
		this.esBebidaOPerfume = esBebidaOPerfume;
		this.precioTotalPorArticulo = cantidad * precio;
	}

	public Double calcularPrecioPorArticulo() {
		precioTotalPorArticulo = cantidad * precio;
		if (esBebidaOPerfume == false) {
			precioTotalPorArticulo = precioTotalPorArticulo + (precioTotalPorArticulo * IMPUESTOGENERAL);
		} else {
			precioTotalPorArticulo = precioTotalPorArticulo + (precioTotalPorArticulo * IMPUESTOBEBIDAYPERFUME);
		}
		System.out.println("La cantidad es de: " + cantidad + " y el precio por articulos es de: " + precio);
		System.out.println("El precio total de este articulo es de: " + precioTotalPorArticulo);
		return precioTotalPorArticulo;
	}
	

	LinkedList<Facturas> listaDeProductos = new LinkedList<Facturas>();

	public void agregarArticulo(Facturas articulo) {
		listaDeProductos.add(articulo);
	}

	public void calcularTotalDeLaFactura() {

		for (Facturas contador : listaDeProductos)
			precioTotal = precioTotal + contador.calcularPrecioPorArticulo();
		System.out.println(precioTotal);
	}

	

}
