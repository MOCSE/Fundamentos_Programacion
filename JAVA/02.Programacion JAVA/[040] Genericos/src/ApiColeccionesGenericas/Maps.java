package ApiColeccionesGenericas;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        
        //Interface Map | Llave - Valor
        Map <String, String> miMapa = new HashMap<>();
        miMapa.put("A1", "Juan"); //Agregar || key , valor
        miMapa.put("A2", "Karla");
        miMapa.put("A3", "Pedro");
        
        String elemento = miMapa.get("A3");
        System.out.println("elemento = " + elemento);
        
        //Recuperar todas las llaves || No se garantiza recuperar el orden en que fueron ordenados los elementos
        for (Object key : miMapa.keySet()) {
            System.out.println("key = " + key);
        }
        
        //Recuperar todas los valores || No se garantiza recuperar el orden en que fueron ordenados los elementos
        for (Object valor : miMapa.values()) {
            System.out.println("valor = " + valor);
        }
    }
}
