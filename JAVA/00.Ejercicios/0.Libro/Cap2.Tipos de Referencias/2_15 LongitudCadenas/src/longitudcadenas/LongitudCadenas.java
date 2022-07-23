package longitudcadenas;

import java.util.ArrayList;

public class LongitudCadenas {

    public static void main(String[] args) {
        System.out.println("Array:");
        String[] arrayCadenas = {"abc", "Oscar","Programacion","resta","abc22@22323XD"};
        longitudCadenas(arrayCadenas);
        
        System.out.println("\nArrayList:");
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Cd1");
        listaCadenas.add("Cad333ena2");
        listaCadenas.add("Cajjjfg3");
        listaCadenas.add("090hna4");
        listaCadenas.add("11111Cadenadsfds5");
        longitudCadenas(listaCadenas);
    }
    
    public static void longitudCadenas(String[] cadenas){
        for (String cadena : cadenas) {
            System.out.println(cadena + " | Longitud: " + cadena.length());
        }
    }
    
    public static void longitudCadenas(ArrayList<String> cadenas){
        for (String cadena : cadenas) {
            System.out.println(cadena + " | Longitud: " + cadena.length());
        }
    }
}
