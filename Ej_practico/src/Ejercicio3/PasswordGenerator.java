package Ejercicio3;
import java.util.Random;
public class PasswordGenerator {
 
	
	 public  String generarMatricula() {
		    String matricula = "";
		    int a;
		    for (int i = 0; i < 7; i++) {
		        if (i < 4) {    // 0,1,2,3 posiciones de numeros
		            matricula = (int) (Math.random() * 9) + "" + matricula;

		        } else {       // 4,5,6 posiciones de letras
		            do {
		                a = (int) (Math.random() * 26 + 65);///
		            } while (a == 65 || a == 69 || a == 73 || a == 79 || a == 85);

		            char letra = (char) a;
		            if (i == 4) {
		                matricula = matricula + "-" + letra;
		            } else {
		                matricula = matricula + "" + letra;
		            }

		        }
		    }
		    System.out.println(matricula);
		    return matricula;
		}
	 }