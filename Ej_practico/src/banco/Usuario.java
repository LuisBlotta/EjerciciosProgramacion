package banco;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Cajero usuario1 = new Cajero (15000);
		
		usuario1.depositar(8000);
		usuario1.extraer(5000);
		usuario1.consultar();
		
	}

}
