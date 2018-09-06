package Ejercicio2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import java.util.LinkedList;
class LinkedL {

	@Test
	 public void recorriendoListas() {
		
		LinkedList<Integer> listaOriginal = new LinkedList<>();
		
		listaOriginal.add(10);
        listaOriginal.add(2);
        listaOriginal.add(5);
        listaOriginal.add(7);
        listaOriginal.add(9);
        listaOriginal.add(2);
        listaOriginal.add(100);
        System.out.println(listaOriginal.size());
        //Sin usar el metodo get() comprobá que el primer numero de la lista es 20
        
        LinkedList<Integer> listaOriginalMultiplicadaPor2 = new LinkedList<>();
        for (Integer unNumero : listaOriginal) {

            listaOriginalMultiplicadaPor2.add(unNumero * 2);
        }
        System.out.println(listaOriginal);
        System.out.println(listaOriginalMultiplicadaPor2);
        
        Integer ultimo = listaOriginalMultiplicadaPor2.size();
        Integer primero = listaOriginalMultiplicadaPor2.size() -  (listaOriginalMultiplicadaPor2.size() - 1);

        assertEquals(20, (int) ultimo);

        assertEquals(20, (int) primero);

		
        //Sin usar el metodo get() comprobá que el ultimo numero de la lista es 100
        
        LinkedList<Integer> listaOriginalDivididaPor2 = new LinkedList<>();
        for (int i = 0; i < listaOriginal.size(); i++) {

            if (listaOriginal.get(i) % 2 == 0) {

                listaOriginalDivididaPor2.add(listaOriginal.get(i));
            }
        }
        
        System.out.println(listaOriginalDivididaPor2);
        assertEquals(100, (int) listaOriginalDivididaPor2.getLast());

        
        
    /*¿Que diferencia existe entre este bloque while y el for anterior?

        LinkedList<Integer> listaRecorridaConWhile = new LinkedList<>();
        Integer j = 0;
        Integer tamanioLista = listaOriginal.size();
        while (j < tamanioLista) {

            if ( (int)listaOriginal.get(j) > 9) {
                listaRecorridaConWhile.add( listaOriginal.get(j));
            }
        }
        assertEquals(100, (int) listaRecorridaConWhile.getLast());

        System.out.println(listaRecorridaConWhile);

        */
	}

}
