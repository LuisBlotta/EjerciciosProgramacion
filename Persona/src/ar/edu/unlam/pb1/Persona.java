package ar.edu.unlam.pb1;

public class Persona {


	private String nombre;
	private String apellido;
	private int edad;
	private long dni;
	private boolean estaViva;
	
	public static int cantidadPersonasVivas;
	
	public Persona(String nombre, String apellido){
		setNombre(nombre);
		setApellido(apellido);	
		nacer();	
	}
	
	public Persona(long dni){
		setNombre("Todavía no tiene nombre");
		setApellido("Todavia no tiene apellido");
		nacer();
		setDni(dni);
	}
	
	public void nacer(){
		this.estaViva = true;
		this.edad = 0;
		System.out.println(toString() + " nació");
		cantidadPersonasVivas++;
	}
	
	public void morir(){
		this.estaViva = false;
		System.out.println(toString() + " murió ");
		cantidadPersonasVivas--;
	}
	
	public void crecer(){
		if(estaViva){
			edad++;
			System.out.println(toString() + " cumpló " + edad + " años");
		}
	}
	
	public String toString(){
		return nombre + " " + apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public long getDni() {
		return dni;
	}

	public void setDni(long dni) {
		if(dni>0){
			this.dni = dni;
		}
	}

	public int getEdad() {
		return edad;
	}

	public boolean isEstaViva() {
		return estaViva;
	}
	
	public void vivir (int cantidadAñosPorVivir){
		for(int i=0; i<cantidadAñosPorVivir; i++){
			crecer();
		}
		morir();
	}	
}
