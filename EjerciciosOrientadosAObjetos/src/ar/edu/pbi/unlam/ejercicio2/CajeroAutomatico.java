package ar.edu.pbi.unlam.ejercicio2;

import java.util.Scanner;

public class CajeroAutomatico {
	
	private static final int DEPOSITAR = 1;
	private static final int EXTRAER = 2;
	private static final int CONSULTAR = 3;
	private static final int SALIR = 4;
		
	public static void main(String[] args){
		
		Scanner teclado = new Scanner(System.in);
		int opcionIngresada = 0;
		double cantidadIngresada;
		
		Cuenta cuentaActual;
				
		// Prueba 1 - Cuenta vacía
		//cuentaActual = new Cuenta("Caballero");
		// Prueba 2 - Cuenta con saldo
		cuentaActual = new Cuenta("Caballero", 100);
		
		System.out.println("Opciones: ");
		System.out.println("1. Depositar");
		System.out.println("2. Extraer");
		System.out.println("3. Consultar saldo");
		System.out.println("4. Salir");
		
		System.out.println("Ingrese opcion deseada");
		opcionIngresada = teclado.nextInt();
		while(opcionIngresada != SALIR){
			while(opcionIngresada > 4 && opcionIngresada < 1){
				System.out.println("Ingrese opcion deseada");
				opcionIngresada = teclado.nextInt();
			}
			
			switch(opcionIngresada){
			case DEPOSITAR:
				System.out.println("Ingrese la cantidad a depositar:");
				cantidadIngresada = teclado.nextDouble();
				depositar(cuentaActual, cantidadIngresada);
				break;
			case EXTRAER:
				System.out.println("Ingrese la cantidad a extraer:");
				cantidadIngresada = teclado.nextDouble();
				extraer(cuentaActual, cantidadIngresada);
				//cuentaActual.retirar(cantidadIngresada);
				break;
			case CONSULTAR:
				consultar(cuentaActual);
				break;
			case SALIR:
				break;
			default:
				System.out.println("Nunca debería entrar acá");
			}
			
			System.out.println("Opciones: ");
			System.out.println("1. Depositar");
			System.out.println("2. Extraer");
			System.out.println("3. Consultar saldo");
			System.out.println("4. Salir");
			
			System.out.println("Ingrese opcion deseada");
			opcionIngresada = teclado.nextInt();
		}
	}
	
	private static void depositar(Cuenta cuentaADepositar, double cantidad){
		cuentaADepositar.ingresar(cantidad);
	}
	
	private static void extraer(Cuenta cuentaAExtraer, double cantidad){
		cuentaAExtraer.retirar(cantidad);
	}
	
	private static void consultar(Cuenta cuentaAConsultar){
		System.out.println(cuentaAConsultar.toString());
	}

}
