package prueba;


	import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


	public class MainClass {
		
	    static class Persona implements Comparable<Persona> {

	        public String nombre;
	        public int edad, altura;

	        public Persona(String nombre, int edad, int altura) {
	            this.nombre = nombre;
	            this.edad = edad;
	            this.altura = altura;
	        }

	        @Override
	        public int compareTo(Persona o) {
	            if (altura < o.altura) {
	                return -1;
	            }
	            if (altura > o.altura) {
	                return 1;
	            }
	            return 0;
	        }
	    }
	    
	    static void imprimeArrayPersonas(List<Persona> array) {
	        for (int i = 0; i < array.size(); i++) {
	            System.out.println((i+1) + ". " + array.get(i).nombre + " - Altura: " + array.get(i).altura + " - Edad: " + array.get(i).edad);
	        }
	    }

	    public static void main(String[] args) {
	        List<Persona>  miLista = new ArrayList<>();

	        
	        Persona p1= new Persona("Mario", 22, 187);
	        Persona p2= new Persona("Pepe", 52, 173);
	        Persona p3 = new Persona("Manuel", 27, 158);
	        Persona p4 = new Persona("David", 25, 164);
	        Persona p5= new Persona("Alberto", 80, 184);
	        
	        miLista.add(p1);
	        miLista.add(p2);
	        miLista.add(p3);
	        miLista.add(p4);
	        miLista.add(p5);

	        System.out.println("Array sin ordenar por altura");
	        imprimeArrayPersonas(miLista);
	        // Ordeno el array de personas por altura (de menor a mayor).
	        Collections.sort(miLista);
	        System.out.println("Array ordenado por altura");
	        
	        imprimeArrayPersonas(miLista);
	    }
	
}
