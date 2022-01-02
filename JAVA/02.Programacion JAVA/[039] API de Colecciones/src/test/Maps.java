package test;

import java.util.*;

public class Maps {
    public static void main(String[] args) {
        
        //Interface Map | Llave - Valor
        Map miMapa = new HashMap();
        miMapa.put("A1", "Juan"); //Agregar || key , valor
        miMapa.put("A2", "Karla");
        miMapa.put("A3", "Pedro");
        miMapa.put("A3", "Carlos"); //No se duplica las llaves, por lo tanto se sustituye con el ultimo valor agregado
        
        //Acceder a los valores (Retornar en tipo Object) [Downcast]
        String elemento = (String) miMapa.get("A3"); //Para acceder es necesario proporcionar la llave
        System.out.println("elemento A3= " + elemento);
        
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
