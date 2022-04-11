package ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ArrayList_ {

    public static void main(String[] args) {
        
        //Crear un ArrayList
        List<String> listaColores = new ArrayList<>();
        
        //Creación mediante la clase Arrays
        String [] nombres = {"Arturo", "Daniel", "Javier", "Gustavo", "Pamela"};
        List<String> listaNombres = Arrays.asList(nombres);
        
        //Adicion de elementos individuales
        listaColores.add("Azul");
        listaColores.add("Amarillo");
        listaColores.add("Morado");
        System.out.println(listaColores);
        System.out.println(listaColores.get(0));
        
        //Construir lista a partir de otra lista
        List<String> elementos = new ArrayList<>(listaColores);
        
        //Adicion de elementos de otra coleccion (copiar listas) 
        elementos.addAll(listaNombres);
        
        //Iteracion con forEach + lambdas Referenciadas
        System.out.println("#### Lista Colores");
        listaColores.forEach(System.out::println);
        System.out.println("\n#### Lista Nombres");
        listaNombres.forEach(System.out::println);
        System.out.println("\n#### Lista Elementos");
        elementos.forEach(System.out::println);

        //Iteracion a través del ArrayList
        ListIterator<String> iterador = listaColores.listIterator();
        
        System.out.println("\n#### Recorrido con Iterador");
        while(iterador.hasNext()){
            System.out.println(iterador.nextIndex() + " Nombre: " + iterador.next());
        }
        
        System.out.println("\n#### Recorrido inverso con Iterador");
        while(iterador.hasPrevious()){
            System.out.println(iterador.previousIndex() + " Nombre: " + iterador.previous());
        }
        
        System.out.println("\n#### Borrar Elemento en Recorrido con Iterador");
        while(iterador.hasNext()){
            if(iterador.next().equals("Amarillo")){
                iterador.remove();
            }
        }
        
        System.out.println("\n#### Recorrido con Iterador Actualizado");
        for(ListIterator<String> iterador2 = listaColores.listIterator(); iterador2.hasNext(); ){
            System.out.println("Nombre: " + iterador2.next());
        }
    }
}
