package ar.edu.unlam.pb2.factura;

public class ArticuloDeLujo extends Articulo{

	

	
	public ArticuloDeLujo(Double cantidad, Double precio) {
		super(cantidad, precio);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Double totalPorArticulo() {
		Double totalPorArticulo=0.0;
		totalPorArticulo =  cantidad * precio;
		totalPorArticulo = totalPorArticulo * IMPUESTODELUJO+ totalPorArticulo;
		return totalPorArticulo;
	}
}
