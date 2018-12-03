package prueba;

import java.util.*;

public class Persona {

	String nombre;
	Integer Id;
	
	Persona	(Integer id, String nombre) {
		this.Id= id;
		this.nombre = nombre;
	}
		
	
	public Map <String, Integer> listaClientes (Map<Integer, Persona> mapa){
		Map <String, Integer> mapaClientes = new HashMap <String, Integer>();
		
		for (Persona p : mapa.values()) {
			if (mapaClientes.containsKey(p.getNombre())) {
			mapaClientes.put(p.getNombre(), mapaClientes.get(p.getNombre())+1);
			}
			else {
				mapaClientes.put(p.getNombre(), 1);
			}
		}
		
		return mapaClientes;
		
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Id == null) ? 0 : Id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (Id == null) {
			if (other.Id != null)
				return false;
		} else if (!Id.equals(other.Id))
			return false;
		return true;
	}


	public String getNombre() {
		return nombre;
	}
	public Integer getId() {
		return Id;
	}
	
	
}
