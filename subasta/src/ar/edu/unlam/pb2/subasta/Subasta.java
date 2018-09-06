package ar.edu.unlam.pb2.subasta;

public class Subasta {

	private Integer valor;
	private Boolean cerrado;

	public Subasta(Integer valor) {
		this.valor = valor;
		this.cerrado = false;

	}

	public void ofertar(Integer valor) {

		if (this.cerrado == false && this.valor < valor) {
			this.valor = valor;
		}
	}

	public Integer cerrar() {

		this.cerrado = true;
		return this.valor;
	}

	public Boolean estadoSubasta() {
		return this.cerrado ;
		
	}

}
