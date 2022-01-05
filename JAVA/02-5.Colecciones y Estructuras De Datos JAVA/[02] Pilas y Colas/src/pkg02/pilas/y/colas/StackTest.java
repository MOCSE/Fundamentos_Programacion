package pkg02.pilas.y.colas;

import java.util.EmptyStackException;
import java.util.Stack;

public class StackTest {

    public static void main(String[] args) {
        Stack<Number> pila = new Stack<>();

        //Push || Meter datos a la pila
        pila.push(12L);
        pila.push(34567);
        pila.push(1.0F);
        pila.push(1234.5678);
        System.out.println("Se metio 12L - 34567 - 1.0F - 1234.5678");
        imprimirPila(pila);

        //Pop || Sacar elementos de la pila
        try {
            Number objetoEliminado = null;

            while (true) {
                objetoEliminado = pila.pop();
                System.out.printf("Se saco %s de la pila\n", objetoEliminado);
                imprimirPila(pila);
            }
        } catch (EmptyStackException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    //Imprimir el contenido de la pila
    private static void imprimirPila(Stack<Number> pila) {
        if (pila.empty()) {
            System.out.printf("La pila esta vacia %n%n\n");
        } else {
            System.out.printf("El elemento superior es %s%n", pila.peek());
            System.out.printf("La pila contiene %s (cima) %n\n", pila);
        }
    }
}
