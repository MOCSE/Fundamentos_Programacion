/*
    Reglas de bolas de dos colores: cada apuesta en la bola de dos colores consta de 6 números de bolas rojas y 1 número de bolas azules. 
    El número de bola roja se selecciona del 1 al 33; el número de bola azul se selecciona del 1 al 16; genere aleatoriamente un número 
    de bola de doble color. (Requiere que no se repita el mismo número de color)
*/
package Ejercicio4_HashSet;

import Ejercicio1_ArrayList.NumerosRandom;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class mainEjercicio4 {

    public static void main(String[] args) {
        Set<Integer> bola = new HashSet<>();
        
        while(bola.size() < 6){
            bola.add(NumerosRandom.getInt(1, 33));
        }
        
        while(bola.size() < 7){
            bola.add(NumerosRandom.getInt(1, 16));
        }
        
        System.out.println("Bola: " + bola);
        
        Iterator<Integer> it = bola.iterator();
        int i = 0;
        while (i < 6){
            System.out.println("Numero Color Rojo: " + it.next());
            i++;
        }
        System.out.println("Numero Color Azul: " + it.next());
    }
    
}
