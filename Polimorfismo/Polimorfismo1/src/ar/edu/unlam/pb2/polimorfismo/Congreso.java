package ar.edu.unlam.pb2.polimorfismo;

import java.util.LinkedList;
import java.util.List;



public class Congreso {
	

	private List<Persona> asistentes = new LinkedList<Persona>(); // en esta list apuede ir cualquie objeto person o sus subclases
	
	public void agregarAsistente(Persona persona){
		this.asistentes.add(persona);
		
	}
	
	public void saludarATodos(){
		for (Persona contador: asistentes)
			contador.saludar();
			  
		
	}
}
