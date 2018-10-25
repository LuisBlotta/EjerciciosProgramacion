package ar.edu.unlam.pb2.factura;

import java.util.LinkedList;
import java.util.List;



public class Detalles extends Factura {
	
	 Factura detalles;
	 
	 
	public Detalles() {
		
		// TODO Auto-generated constructor stub
	}

	
	
	public void agregarArticulos(Factura articulo) {
		listaDeArticulos.add(articulo);
	}
	
	
	
	

	public static List<Factura> getListaDeArticulos() {
		return listaDeArticulos;
	}

	
	}
