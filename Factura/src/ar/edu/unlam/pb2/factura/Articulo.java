package ar.edu.unlam.pb2.factura;

public class Articulo extends Detalles {

	

	public Articulo(Double cantidad, Double precio) {
		
		this.precio = precio;
		this.cantidad = cantidad;
		
	}
	
	
	
	public Double totalPorArticulo(){
		Double totalPorArticulo=0.0;
		totalPorArticulo = cantidad * precio;
		totalPorArticulo = totalPorArticulo * IMPUESTOGENERAL+ totalPorArticulo;
		return totalPorArticulo;
	}



	public Double getCantidad() {
		return cantidad;
	}

	public Double getPrecio() {
		return precio;
	}
	
	
	

}
