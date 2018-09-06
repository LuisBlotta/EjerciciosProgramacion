package banco;

public class Cajero {

		private float saldo;

		
		public Cajero() {}
		
		public Cajero (float saldo) {
			setSaldo(saldo);
			System.out.println("El saldo inicial de su cuenta es: " + saldo );
		}
		
		
		public void setSaldo(float saldo) {
			this.saldo = saldo;
		}
	
		public void depositar(float deposito) {
			
			saldo = saldo + deposito;
			System.out.println("\nSu nuevo saldo es de: " + saldo);
		}
		
		public void extraer(float extraccion) {
			if (extraccion <= saldo) {
			saldo = saldo - extraccion;
			System.out.println("\nSu nuevo saldo es de: " + saldo);
			}
			else{
				System.out.println("\nUsted no posee los fondos suficientes");
			}
			
		}
		
		public void consultar() {
			System.out.println("\nSu saldo es de: " + saldo);
		}
}
