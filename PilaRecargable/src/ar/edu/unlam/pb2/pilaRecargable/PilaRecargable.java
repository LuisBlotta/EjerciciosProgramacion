package ar.edu.unlam.pb2.pilaRecargable;

public class PilaRecargable {

	private Integer velocidadDeCarga;
	private Integer velocidadDeConsumo;
	private Integer carga=0;
	private Integer cargasTotales=0;
	private Integer consumoTotal=0;
	private String prueba;

	public PilaRecargable(Integer velocidadDeCarga, Integer velocidadDeConsumo) {
		this.velocidadDeCarga = velocidadDeCarga;
		this.velocidadDeConsumo = velocidadDeConsumo;
	}
	public PilaRecargable(String prueba) {
this.prueba = prueba;
	}

	public Integer medirCarga() {
	//	System.out.println(carga);
		return carga;
	}

	public Integer consumir(Integer tiempo) {
		
		this.carga = carga - (velocidadDeConsumo * tiempo);
		if (this.carga < 0) {
			this.carga = 0;
					}
		this.consumoTotal = this.consumoTotal + tiempo;
	//	System.out.println(carga);
		return carga;
		}
	
		

	public Integer cargar(Integer tiempo) {
		this.carga = carga + (velocidadDeCarga * tiempo);
		
		if (this.carga > 100) {
			this.carga = 100;
		}
		
		if (carga == 100) {
			cargasTotales = cargasTotales + 1;
		}
		
		//System.out.println(carga);
		return carga;
	}


	public Integer getMedirConsumoTotal() {
	//	System.out.println(consumoTotal);
		return consumoTotal;
	}
	
	public Integer getCargasTotales() {
		//System.out.println(cargasTotales);
		return cargasTotales;
	}
	
	@Override
	public boolean equals(Object obj) {
		PilaRecargable objeto = (PilaRecargable) obj;
		return this.velocidadDeCarga.equals(objeto.velocidadDeCarga);
	}

	@Override
	public int hashCode() {
		int resultado = 1;
		 resultado = resultado + prueba.hashCode();
		System.out.println(resultado);
		return resultado;
		
	}
}
