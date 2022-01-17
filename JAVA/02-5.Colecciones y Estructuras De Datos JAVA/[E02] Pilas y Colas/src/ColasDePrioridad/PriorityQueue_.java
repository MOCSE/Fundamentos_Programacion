package ColasDePrioridad;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueue_ {

    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue();
        
        //Añadir a cola de prioridad
        queue.add("C");
        queue.add("C++");
        queue.add("Java");
        queue.add("Python");
        System.out.println("Cola De Prioridad: " + queue);
        
        //Mostrar (sin eliminar) el elemento de mayor prioridad
        System.out.println(" El valor del head es: " + queue.peek());
        
        //Remover el elemento top de la cola de prioridad
        String elementoDesencolado = queue.poll();
        
        //Iterar con Iterator
        System.out.println("\n Despues de remover el elemento de mayor prioridad");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
        //Remover un elemento especifico
        queue.remove("Java");
        System.out.println("\n Despues de remover JAVA");
        itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
        
        //Checar si un elemento está presente en nyestra cola de prioridad
        boolean b = queue.contains("C");
        System.out.println("\n La cola de prioridad contiene el elemento C?: " + b);
        
        //Obtener elementos de la cola en un array simple (devuelve objetos)
        Object [] arr = queue.toArray();
        
    }
}
