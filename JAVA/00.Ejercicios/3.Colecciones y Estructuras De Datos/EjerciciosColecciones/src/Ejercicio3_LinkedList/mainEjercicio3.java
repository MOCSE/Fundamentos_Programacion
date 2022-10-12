/*
    La matriz conocida almacena un lote de números QQ. El número QQ más largo es de 11 dígitos y el más corto es de 5 dígitos 
    String [] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933" }.
    Almacene todos los números qq de la matriz en LinkedList, elimine los elementos repetidos en
    la lista e imprima todos los elementos en la lista con un iterador y un bucle for mejorado.
*/

package Ejercicio3_LinkedList;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class mainEjercicio3 {
    public static void main(String[] args) {
        String [] strs = {"12345", "67891", "12347809933", "98765432102", "67891", "12347809933" };
        Set<String> linkedHashSet = new LinkedHashSet<>(Arrays.asList(strs));
        
        Iterator it = linkedHashSet.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        
    }
    
}
