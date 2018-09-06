package ar.edu.unlam.pb1;

import java.util.Scanner;

public class RegistroCivil {

	public static void main(String[] args) {
		
		final int TOPE = 4;
		
		Persona registradas[] = new Persona[TOPE];
		String apellido, nombre;
						
		Scanner teclado = new Scanner(System.in);
			
		for(int i=0; i<TOPE; i++){
			
			System.out.println("Ingrese el nombre:");
			nombre = teclado.next();
			System.out.println("Ingrese el apellido:");
			apellido = teclado.next();
			
			registradas[i] = new Persona(nombre, apellido);
		}
		
		Persona alumno = new Persona("Natalia", "Lopez");
		
		registradas[3] = alumno;
		for(int i=0; i<TOPE; i++){
			System.out.println(registradas[i].toString());
		}
	}

	private static void vivir (Persona personaViva, int cantidadAñosPorVivir){
		for(int i=0; i<cantidadAñosPorVivir; i++){
			personaViva.crecer();
		}
		personaViva.morir();
	}

}
