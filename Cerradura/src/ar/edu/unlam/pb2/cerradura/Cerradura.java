package ar.edu.unlam.pb2.cerradura;

public class Cerradura {

	private String password = "Cerradura123";
	private Boolean cerraduraAbierta = false;
	private Boolean cerraduraBloqueada = false;
	private Integer cantidadIntentosFallidos = 0;
	
	
	
	public Boolean comprobarEstadoCerradura() {
		return cerraduraAbierta;
				
	}
	
		
	
	public String ingresarContraseña(String pass) {
		if (password.equals(pass)) {
			cerraduraAbierta = true;
		}
		else {
		cerraduraAbierta = false;
		cantidadIntentosFallidos = cantidadIntentosFallidos +1;
		
		}
		return pass;
		
	}
	
	public Boolean cerraduraBloqueada() {
		
		if (cantidadIntentosFallidos == 3) {
			this.cerraduraBloqueada = true;
			System.out.println(this.cantidadIntentosFallidos + " Cerradura bloqueada");
		}
		else {
		System.out.println(this.cantidadIntentosFallidos + " Cerradura abierta");}
		return cerraduraBloqueada;
		
		
			}

	public String getPassword() {
		return password;
	}
	
	
	
}
