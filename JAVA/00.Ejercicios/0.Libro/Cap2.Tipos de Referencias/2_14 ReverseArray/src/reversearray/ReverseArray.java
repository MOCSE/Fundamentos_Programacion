package reversearray;

import java.util.ArrayList;
import java.util.ListIterator;

public class ReverseArray {

    public static void main(String[] args) {
        //Array
        String[] arrayCadenas = {"cadena1","cadena2","cadena3","cadena4","cadena5"};
        
        //ArrayList
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Cadena1");
        listaCadenas.add("Cadena2");
        listaCadenas.add("Cadena3");
        listaCadenas.add("Cadena4");
        listaCadenas.add("Cadena5");
        
        reverseArray(arrayCadenas);
        reverseArray(listaCadenas);
    }
    
    public static void reverseArray(String[] array){
        System.out.println("\n\nImprimiendo Reverse Array");
        for (int i = array.length-1; i >= 0; i--) {
            System.out.print("[" + array[i] + "] ");
        }
    }
    
    public static void reverseArray(ArrayList<String> array){
        System.out.println("\n\nImprimiendo Reverse ArrayList");
        ListIterator<String> iterador = array.listIterator(array.size());
        while(iterador.hasPrevious()){
            System.out.print("[" + iterador.previous() + "] ");
        }
    }
}
