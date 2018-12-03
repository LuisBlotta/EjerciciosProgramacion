package ar.edu.unlam.pb2.mapas;

import java.util.*;

public class Mapas {
	
	
	String nombre;
	Integer Id;

	public Map<Character, Integer> crearMapa (String palabra){
		Map<Character, Integer> mapa = new HashMap <>();
		
		for (Character c : palabra.toCharArray()) {
			if(!mapa.containsKey(c)) {
				mapa.put(c, 0);
			}
			Integer cantidad = mapa.get(c);
			mapa.put(c, cantidad+1);
		}
		
		
		return mapa;
			}
	
	
	public Map<String, Integer> listaClientes (Map <Integer, String> mapaRecibido){
		
		Map<String, Integer> nuevoMapa = new TreeMap<String, Integer>();
		
		for (String nombreClave : mapaRecibido.values()) {
			if(!nuevoMapa.containsKey(nombreClave)) {
				nuevoMapa.put(nombreClave, 0);

			}
			Integer cantidad = nuevoMapa.get(nombreClave);
			nuevoMapa.put(nombreClave, cantidad+1);
		}
		
		
		return nuevoMapa;
	}

	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}
	
}
