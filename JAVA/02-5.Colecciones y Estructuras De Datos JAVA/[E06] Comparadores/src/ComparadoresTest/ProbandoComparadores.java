package ComparadoresTest;

import Comparable.Student2;
import Comparable.Student;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProbandoComparadores {
    public static void main(String[] args) {
        //PriorityQueue, TreeMap, TreeSet aplican los principios de comparación.
        
        List<String> nombres = new ArrayList<>();
        nombres.add("Raquel");
        nombres.add("Esteban");
        nombres.add("Arturo");
        nombres.add("Javier");
        nombres.add("Sebastián");
        nombres.add("Adriana");
        nombres.add("Oyuki");
        
        System.out.println(nombres);
        
        Collections.sort(nombres);
        
        System.out.println("\n nombres después de la ordenación:");
        System.out.println(nombres);
        
        System.out.println("\nOrdenamiento inverso de nombres");
        Collections.sort(nombres, Collections.reverseOrder());
        System.out.println(nombres);
        
        
        
        
        
        
        
        List<Integer> numeros = new ArrayList<>();
        numeros.add(3);
        numeros.add(6);
        numeros.add(8);
        numeros.add(8);
        numeros.add(1);
        numeros.add(9);
        numeros.add(11);
        
        System.out.println("\n");
        System.out.println(numeros);
        
        Collections.sort(numeros);
        
        System.out.println("\nNúmeros después de la ordenación:");
        System.out.println(numeros);
        
        System.out.println("\nOrdenamiento inverso de números:");
        Collections.sort(numeros, Collections.reverseOrder());
        System.out.println(numeros);
       
    }
}
