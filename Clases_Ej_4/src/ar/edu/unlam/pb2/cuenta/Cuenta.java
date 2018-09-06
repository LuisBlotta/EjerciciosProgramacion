package ar.edu.unlam.pb2.cuenta;

public class Cuenta {
	private String titular;
	private Double saldo;

	public Cuenta(String titular) {
		this.titular = titular;
	}

	public Cuenta(String titular, Double saldo) {
		this.titular = titular;
		this.saldo = saldo;

	}

	public Double depositar(Double cantidad) {
		if (cantidad > 0) {
			this.saldo = this.saldo + cantidad;
		} else {
			System.out.println("Ingrese un monto mayor a 0");
		}
		return this.saldo;
	}

	public Double retirar(Double cantidad) {
		if (cantidad <= this.saldo) {
			this.saldo = this.saldo - cantidad;
		} else {
			System.out.println("Ingrese un monto menor a su saldo total");
		}
		return this.saldo;
	}
	
	

}
