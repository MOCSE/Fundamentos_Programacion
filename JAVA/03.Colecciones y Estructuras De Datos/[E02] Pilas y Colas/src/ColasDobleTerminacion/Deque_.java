
package ColasDobleTerminacion;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;


public class Deque_ {
    public static void main(String[] args) {
        
        //Tambien se puede usar LinkedList, pero ArrayDeque tiene mejor rendimiento
        Deque<Integer> numersList = new ArrayDeque<>();
        
        //Añadir elementos (Tail de la cola) - 1,2,3,4,5...
        for (int i = 1; i <= 10; i++) {
            numersList.add(i);
        }
        
        System.out.println(numersList);
        
        //Metodos en Deque
        System.out.println("Head: " + numersList.peek()); //peekFirst()
        System.out.println("Tail: " + numersList.peekLast()); //getLast()
        System.out.println("Head->" + numersList + "<- Tail");
        //Sacar elemento del head la cola
        System.out.println("Pop Action: " + numersList.pollFirst()); //poll()
        System.out.println("Head->" + numersList + "<- Tail\n");
        
        //Diferencia entre pilas
        Deque<Integer> listaPilaDeque = new ArrayDeque<>();
        Stack<Integer> listaPilaStack = new Stack<>();
        
        //push || añadir a la pila - 1,2,3,4,5...
        for (int i = 1; i <= 10; i++) {
            listaPilaDeque.push(i);
            listaPilaStack.push(i);
        }
        
        //Uso de pilas (diferencias)
        System.out.println("Deque -> " + listaPilaDeque);
        System.out.println("Stack -> " + listaPilaStack);
    }
}
