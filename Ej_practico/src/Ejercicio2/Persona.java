package Ejercicio2;

public class Persona {

	private String nombre=null;
	private int edad=0;
	private int dni;
	private boolean SEXO=false;
	private char sex;
	private double peso=0;
	private double altura=0;
	private int imc;
	
	public Persona() {
	
	}
	
	public Persona(String nombre, int edad, boolean SEXO) {
		setNombre(nombre);
		setEdad(edad);
		setSEXO(SEXO);
	}
	
	public Persona(String nombre, int edad, int dni, char sex, double peso, double altura) {
		
		setNombre(nombre);
		setEdad(edad);
		setDni(dni);
		setSEXO(SEXO);
		setPeso(peso);
		setAltura(altura);
		setSex(sex);
		IMC();
		esMayorDeEdad();
		comprobarSexo(sex);
		generaDni();
	}
	
	
	public void IMC() {
		imc = (int) (peso / (altura * altura));
		
		if (imc < 20) {
			imc = -1;
			}
		else {
			
			if(imc >= 20 && imc <= 25 ){
				imc = 0;
				
			}
			else {
				imc = 1;
			}
		}
		
		switch (imc) {
		
		case 0:
			System.out.println("Estas en tu peso ideal");
			break;
			
		case -1: 
			System.out.println("Estas debajo de tu peso ideal");
			break;
			
		case 1:
			System.out.println("Estas exedido de peso");
			break;
		
		}
		
				
	}
	
	
		public void esMayorDeEdad() {
		if (edad > 18) {
			
			boolean mayor = true;
			System.out.println(toString() + " Es mayor de edad");
		}	
		else {
			System.out.println(toString()+  " Es menor de edad");
		}
			
		}
	
		public void comprobarSexo(char sex) {
			if (sex == 'h') {
				SEXO = true;
				System.out.println("Es hombre");
					}
			else {
				if (sex == 'm') {
				SEXO = false;
				System.out.println("Es mujer");
			}
				
				else {
					System.out.println("Pone bien el sexo");
				}
				}		
		}
		
		
		public String toString() {
			return nombre+ " ";
			
		}
	
	
		public void generaDni() {
			this.dni = (int) (Math.random()* 100000000); 
			System.out.println(this.dni + " Es su numero de documento");
		}
		
		
		
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public boolean isSEXO() {
		return SEXO;
	}
	public void  setSEXO(boolean SEXO) {
		this.SEXO = SEXO;
		
	}
	public void setSex(char sex) {
	this.sex=sex;}
	

	
	
	
	
	
	
	
	
	
}
