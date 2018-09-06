package negocio;
import java.util.Scanner;
public class Deposito {
	public static void main(String[] args) {

		int i=0;
		LaMagra arrayObjetos[]=new LaMagra[3];
				
		Scanner teclado = new Scanner(System.in);
		
		
		for(i=0; i<arrayObjetos.length ; i++) {
        arrayObjetos[i]=new LaMagra();	
        arrayObjetos[i].setNombre();
		arrayObjetos[i].setColor();
		arrayObjetos[i].setIdColor();
		arrayObjetos[i].setTamaño();
		arrayObjetos[i].setPrecio();
		arrayObjetos[i].setDescripcion();
		arrayObjetos[i].setCantidadDePrendas();
		}
		for(i=0; i<arrayObjetos.length ; i++) {
	        
	    arrayObjetos[i].getNombre();
		arrayObjetos[i].getColor();
		arrayObjetos[i].getIdColor();
		arrayObjetos[i].getTamaño();
		arrayObjetos[i].getPrecio();
		arrayObjetos[i].getDescripcion();
		arrayObjetos[i].getCantidadDePrendas();
		}
		
		
		
		
		
		
		
}}
