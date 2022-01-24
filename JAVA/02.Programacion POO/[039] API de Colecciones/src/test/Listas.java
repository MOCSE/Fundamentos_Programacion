package test;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        
        //Interface List || Puede crecer Dinamicamente :0
        
        List miLista = new ArrayList();
        //Agregar elementos al arrayList || Guarda el orden de los elementos con forme se van agregando.
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        
        //Iterar || Se recupera con tipo Object (ya que es un tipo Object)
        for (Object object : miLista) {
            System.out.println("Elemento = " + object);
        }
        
        System.out.println();
        
        //Iterar con funciones lambdas o funcion flecha
        miLista.forEach(object -> {
            System.out.println("Elemento = " + object);
        });
    }
}
