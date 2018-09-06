package ar.edu.unlam.pb2.rectangulos;

public class Rectangulo {

	private Double base;
	private Double altura;
	
	
	public Rectangulo(Double base, Double altura){
	   this.base = base;
		this.altura = altura;
	}
	
	public Double calcularArea(){
		Double area = 0.0;
		area = base * altura;
		return area;
		
	}
	
	public Double calcularPerimetro(){
	    Double perimetro = 0.0;
	    perimetro = (base * 2) + (altura * 2);
	    return perimetro;
	}
}