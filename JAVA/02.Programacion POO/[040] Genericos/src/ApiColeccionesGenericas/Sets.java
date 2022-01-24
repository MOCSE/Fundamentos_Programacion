package ApiColeccionesGenericas;

import java.util.*;

public class Sets {
    public static void main(String[] args) {
        
        //Agregar elementos al HashSet || NO garantiza el orden de los elementos con forme se van agregando.
            //Es más rapido en agregar elementos a diferencia de los list
            //No se puede duplicar los elementos
        
        Set <String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        
        for (String object : miSet) {
            System.out.println("object = " + object);
        }
    }
}
