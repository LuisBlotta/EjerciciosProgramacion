package ar.edu.unlam.pb2.factura;

public class ImprimirPdf extends Factura implements Impresion{

	

	@Override
	public void imprimir() {
		for (Factura detalles : Detalles.getListaDeArticulos()) {
			System.out.println(detalles.getCantidad() + " Unidades * " + detalles.getPrecio() +" Pesos = " + detalles.totalPorArticulo());
		}
		
		System.out.println("El total a pagar es de: "+ calcularPrecioTotal());
	}
}
