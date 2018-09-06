package ar.edu.pbi.unlam.ejercicio2;

public class Cuenta {
	private String titular;
	private double cantidad;
	
	public Cuenta(String titular){
		this.titular = titular;
		this.cantidad = 0.0;
	}
	
	public Cuenta(String titular, double cantidad){
		this.titular = titular;
		this.cantidad = cantidad;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	// Eliminamos el método cantidad porque no se puede manipular el saldo 
	/*public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}*/
	
	public String toString(){
		return "Titular: " + this.titular + " cantidad: " + this.cantidad;
	}
	
	public void ingresar(double cantidad){
		if(cantidad>=0){
			this.cantidad += cantidad;
		}
	}
	
	public void retirar(double cantidad){
		if(this.cantidad<cantidad){
			this.cantidad = 0;
		}
		else{
			this.cantidad-=cantidad;
		}
	}
	
	

	
}
