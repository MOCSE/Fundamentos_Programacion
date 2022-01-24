package ApiColeccionesGenericas;

import java.util.*;

public class Listas {
    public static void main(String[] args) {
        
        //Interface List || Puede crecer Dinamicamente :0
        
        List<String> miLista = new ArrayList<>();
        //Agregar elementos al arrayList || Guarda el orden de los elementos con forme se van agregando.
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        
        //Ya no es necesario hacer la conversion de tipos para obtenerlos
        String elemento = miLista.get(0);
        System.out.println("elemento sin conversion = " + elemento + "\n");
        
        //Iterar || Se recupera con tipo Object (ya que es un tipo Object)
        for (String string : miLista) {
            System.out.println("Elemento = " + string.toUpperCase());
        }
        
    }
}
