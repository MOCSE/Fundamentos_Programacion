
package ListasEnlazadasSimples;

public class Node {
    private Object data;
    private Node next;
    
    //Constructor
    public Node(Object dato){
        this.data = dato;
    }
    
    //Valor del nodo
    public Object value(){
        return this.data;
    }
    
    //Valor del nodo enlazado
    public Node next(){
        return this.next;
    }
    
    //Establecer nodo enlazado
    public void setNext(Node next){
        this.next = next;
    }
    
    //Imprimir contenido del nodo
    public void showContent(){
        System.out.println("Value: " + this.data);
    }
}
