
package Colas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queue_ {
    public static void main(String[] args) {
        
        //Para implementar una cola, se usa un LinkedList
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        
        // Añade los elmentos {0, 1, 2, 3, 4} a la queue
        for (int i = 0; i < 5; i++)
           queue.add(i); //queue.offer(i);
        
        // Muestra el contenido de la queue
        System.out.println("Elementos de la cola: " + queue);
        
        // Elimina el head de la queue
        int head = queue.remove(); //int head = queue.poll();
        System.out.println("El head de esta cola es: " + head);
        System.out.println("Cola después del método remove/poll: " + queue);
        
        int size = queue.size();
        System.out.println("El tamaño de la cola es: " + size);
        System.out.println("La cabeza de la cola ahora es: " + queue.peek());
        System.out.println("Elementos de la cola: " + queue + "\n");
        
        
        //Pilas
        for (int i = 0; i < 5; i++)
           stack.add(i); //queue.offer(i);
        
        // Muestra el contenido de la queue
        System.out.println("Elementos de la pila: " + stack);
        
        // Elimina el head de la queue
        int head2 = stack.pop();
        // int head = queue.poll();
        System.out.println("El head de esta pila es: " + head2);
        System.out.println("Pila después del método remove/poll: " + stack);
        
        int size2 = stack.size();
        
        System.out.println("El tamaño de la cola es: " + size2);
        System.out.println("La cabeza de la cola ahora es: " + stack.peek());
        System.out.println("Elementos de la cola: " + stack);
    }
}
