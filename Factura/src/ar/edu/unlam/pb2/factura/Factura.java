package ar.edu.unlam.pb2.factura;

import java.util.LinkedList;
import java.util.List;

public class Factura implements Metodos {

	protected final Double IMPUESTOGENERAL = 0.21;
	protected final Double IMPUESTODELUJO = 0.36;

	protected Double precioTotal=0.0;
	 protected Double cantidad;
	 protected Double precio;
	 
		static List<Factura> listaDeArticulos = new LinkedList <Factura>();

	 
	public Factura () {}
		
	
	public Double getCantidad() {
		return cantidad;
	}


	public Double getPrecio() {
		return precio;
	}


	@Override
	public Double totalPorArticulo() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void agregarArticulos(Factura art1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Double calcularPrecioTotal() {
		
		for (Factura detalles : listaDeArticulos) {
			precioTotal = precioTotal + detalles.totalPorArticulo();		}
		return precioTotal;
		
		}

	public void imprimir() {}
	
	public static List<Factura> getListaDeArticulos() {
		return listaDeArticulos;
	}
}
