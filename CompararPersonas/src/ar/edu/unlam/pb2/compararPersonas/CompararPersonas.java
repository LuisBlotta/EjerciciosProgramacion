package ar.edu.unlam.pb2.compararPersonas;

import java.util.Objects;

public class CompararPersonas {

	private String nombre, apellido;
	private Integer dni;
	
	
	public CompararPersonas (String nombre, String apellido, Integer dni) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;		
	}
	
	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	@Override
	public boolean equals(Object obj) {
		CompararPersonas objeto = (CompararPersonas) obj;
		return this.nombre.equals(objeto.nombre);
		}

	@Override
	public int hashCode() {
		 int result = 1;
		 System.out.println(nombre.hashCode());
		 System.out.println(result);
		 return result;
	}
	
	
}
