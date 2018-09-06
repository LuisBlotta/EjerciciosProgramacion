package negocio;
import java.util.Scanner;
public class LaMagra {

	private String nombre;
	private int id;
	private String color;
	private int idColor;
	private String tamaño;
	private String descripcion;
	private float precio;
	private int cantidadDePrendas;


	 Scanner teclado = new Scanner(System.in);
	 public LaMagra() {
	 setId(id);
	 }
	 
	 



	public String getNombre() {
		System.out.println(nombre);
		return nombre;
	}



	public void setNombre() {
		System.out.println("Ingrese el nombre");
		this.nombre = teclado.next();	}



	public int getId() {
		System.out.println(id);
		return id;
	}


	public void setId(int id) {
		System.out.println("Ingrese el ID");
		this.id = teclado.nextInt();
	}


	
	public String getColor() {
		System.out.println(color);
		return color;
	}


	public void setColor() {
		System.out.println("Ingrese el color");
		this.color = teclado.next();
	
	}


	public int getIdColor() {
		System.out.println(idColor);
		return idColor;
	}


	public void setIdColor() {
		System.out.println("Ingrese el ID del color");
		this.idColor = teclado.nextInt();	}



	public String getTamaño() {
		System.out.println(tamaño);
		return tamaño;
	}


	public void setTamaño() {
		System.out.println("Ingrese el Tamaño");
		this.tamaño = teclado.next() ;
	}


	public String getDescripcion() {
		System.out.println(descripcion);
		return descripcion;
	}


	public void setDescripcion() {
		System.out.println("Ingrese La descripción \n");
		this.descripcion = teclado.next() ;	}


	public float getPrecio() {
		System.out.println(precio);
		return precio;
	}


	public void setPrecio() {
		System.out.println("Ingrese el Precio");
		this.precio = teclado.nextFloat() ;
	}


	public int getCantidadDePrendas() {
		this.precio = teclado.nextInt() ;
		return cantidadDePrendas;
	}


	public void setCantidadDePrendas() {
		System.out.println("Ingrese La cantidad");
		this.cantidadDePrendas = cantidadDePrendas;
	}

		
	
}
