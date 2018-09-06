package ar.edu.unlam.pb2.persona;

import java.time.LocalDate;

public class Persona {

	private String nombre = null;
	private String fechaNacimiento = null;
	private Integer edad = 0;
	private Integer dni = 0;
	private Boolean sexo; // false es por defecto hombre
	private Double peso = 0.0;
	private Double altura = 0.0;
	private final Boolean SEXO_POR_DEFECTO = false; // false es por defecto hombre

	public Persona() {
	}

	public Persona(String nombre, Integer edad, Character sexo1) {
		this.nombre = nombre;
		this.edad = edad;
		if (sexo1 == 'H') {
			this.sexo = false;
		}
		if (sexo1 == 'M') {
			this.sexo = true;
		} else {
			this.sexo = SEXO_POR_DEFECTO;
		}
	}

	public Persona(String nombre, String fechaDeNacimiento, Integer edad, Integer dni, Character sexo1, Double peso,
			Double altura) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaDeNacimiento;
		this.edad = edad;
		this.dni = dni;
		if (sexo1 == 'H') {
			this.sexo = false;
		//	System.out.println("Es hombre");
		}
		else {if (sexo1 == 'M') {
			this.sexo = true;
		//	System.out.println("Es mujer");
		} else {
			this.sexo = SEXO_POR_DEFECTO;
		//	System.out.println("Es hombre");
		}}
		this.peso = peso;
		this.altura = altura;
		
	}

	public Double calcularIMC() {
		Double imc;
		final Double DEBAJO_DEL_PESO_IDEAL = -1.0;
		final Double PESO_IDEAL = 0.0;
		final Double ENCIMA_DEL_PESO_IDEAL = 1.0;

		imc = (peso / (altura * altura));

		if (imc < 20) {
			imc = DEBAJO_DEL_PESO_IDEAL;
			System.out.println("Estas debajo de tu peso ideal, la funcion devolvio el valor: " + imc);
		}
		if (imc >= 20 && imc <= 25) {
			imc = PESO_IDEAL;
			System.out.println("Estas en tu peso ideal, la funcion devolvio el valor: " + imc);
		}

		if (imc > 25) {
			imc = ENCIMA_DEL_PESO_IDEAL;
			System.out.println("Estas con sobrepeso, la funcion devolvio el valor: " + imc);
		}
		return imc;
	}

		public Boolean esMayorDeEdad() {
			String dia = fechaNacimiento.substring(0,2);// arranca del valor que esta en 0 y termina en el valor anterior al 2 (toma la posicion 0 y 1))
			String mes = fechaNacimiento.substring(3,5);
			String año = fechaNacimiento.substring(6,10);
			
			
			Integer diaEntero = Integer.parseInt(dia); //transorma un string en Integer
			Integer mesEntero = Integer.parseInt(mes);
			Integer añoEntero = Integer.parseInt(año);

						
			Boolean esMayor = null;
			LocalDate nacimiento = LocalDate.of(añoEntero, mesEntero, diaEntero);
			
			System.out.println(nacimiento);
			
			
			if (2018 - añoEntero < 18) {
				esMayor = false;
				System.out.println("Es menor de edad");
			}
			else {
				esMayor = true;
				System.out.println("Es mayor de edad");

			}
			return esMayor;
		}
		
				
		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getFechaNacimiento() {
			return fechaNacimiento;
		}

		public void setFechaNacimiento(String fechaNacimiento) {
			this.fechaNacimiento = fechaNacimiento;
		}

		public Integer getEdad() {
			return edad;
		}

		public void setEdad(Integer edad) {
			this.edad = edad;
		}

		public Integer getDni() {
			return dni;
		}

		public void setDni(Integer dni) {
			this.dni = dni;
		}

		public Boolean getSexo() {
			return sexo;
		}

		public void setSexo(Boolean sexo) {
			this.sexo = sexo;
		}

		public Double getPeso() {
			return peso;
		}

		public void setPeso(Double peso) {
			this.peso = peso;
		}

		public Double getAltura() {
			return altura;
		}

		public void setAltura(Double altura) {
			this.altura = altura;
		}

		public Boolean getSEXO_POR_DEFECTO() {
			return SEXO_POR_DEFECTO;
		}
			
		
}
