package Ejercicio;

public class Cuenta {
			
	
		private String titular;
		private double cantidad;
		private boolean datoIngresado;
		
		public Cuenta(String titular) {
			setTitular(titular);
			datoIngresado = true;
			
					}
		public Cuenta(double cantidad) {
			setCantidad(cantidad);
			
					}
		
		public void ingresar(double cantidad) {
			if (datoIngresado == true) {
				if(cantidad < 0 ) {
				System.out.println("Es negativo");
							
			}
			
			else {
				this.cantidad = cantidad;
				System.out.println("La cantidad ingresa es: "+cantidad);}
			
		}
			else {
				System.out.println("Ingresa el titular");
			}
		}
		public void retirar(double retiro) {
			if (datoIngresado == true) {
			cantidad = cantidad - retiro;
			if(cantidad< 0) {
				
				cantidad = 0;
				System.out.println("La cantidad es " + cantidad);
			}
			else {
				
				System.out.println(cantidad);
			}}
			else {
				System.out.println("Ingresa el titular");

				
			}
		}
		
		
		public String getTitular() {
			return titular;
		}
		public void setTitular(String titular) {
			this.titular = titular;
			System.out.println("Me llamo "+ titular);

		}
		public double getCantidad() {
			return cantidad;
		}
		public void setCantidad(double cantidad) {
			this.cantidad = cantidad;
		}
		
		public String toString() {
			return titular + " " + cantidad;
			
		}
		public boolean isDatoIngresado() {
			return datoIngresado;
		}
		public void setDatoIngresado(boolean datoIngresado) {
			this.datoIngresado = datoIngresado;
		}
		
		
		
		
		
}
