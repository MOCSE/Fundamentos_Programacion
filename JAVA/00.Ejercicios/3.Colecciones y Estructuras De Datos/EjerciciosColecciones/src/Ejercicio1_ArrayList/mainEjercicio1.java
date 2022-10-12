/*
    1. Genere 10 números aleatorios que van del 1 al 100 y colóquelos en una matriz 
    Coloque los números mayores o iguales a 10 de la matriz en un conjunto de listas e imprímalos en la consola.
*/

package Ejercicio1_ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class mainEjercicio1 {
    public static void main(String[] args) {
        int[] arrayNumeros = NumerosRandom.getArrayInts(1, 100, 10);
        
        List<Integer> listaNumeros = new ArrayList<>();
        
        for (int numero : arrayNumeros) {
            if(numero >= 10){
                listaNumeros.add(numero);
            }
        }
        
        ListIterator<Integer> iterador = listaNumeros.listIterator();
        while (iterador.hasNext()) {            
            System.out.println(iterador.next());
        }
        
    }
}
