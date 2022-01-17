
package ColasDobleTerminacion;

import java.util.ArrayDeque;
import java.util.Deque;

public class ejBufferDeAcciones {
    Deque<String> buffetActions = new ArrayDeque<>();
    Deque<String> redoActions = new ArrayDeque<>();
    
    public static void main(String[] args) {
        ejBufferDeAcciones buffer = new ejBufferDeAcciones();
        buffer.doAction("Copiar");
        buffer.doAction("Pegar");
        buffer.doAction("Escribir Hola");
        buffer.doAction("Borrar");
        buffer.undo();
        buffer.undo();
        buffer.redo();
    }
    
    public void undo(){
        if(buffetActions.isEmpty())
            return;
        System.out.println("##Undo##");
        String action = buffetActions.pollLast();
        redoActions.push(action);
        System.out.println(buffetActions);
    }
    
    public void redo(){
        System.out.println("redo");
        String action = redoActions.pop();
        insertActionInBuffer(action);
        System.out.println("Redo actions: " + redoActions);
        System.out.println(buffetActions);
    }
    
    public void doAction(String action){
        System.out.println(action);
        insertActionInBuffer(action);
        System.out.println(buffetActions);
    }
    
    private void insertActionInBuffer(String action){
        buffetActions.offerLast(action);
    }
}
