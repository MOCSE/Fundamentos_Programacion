
package ListasEnlazadasSimples;

public class SimpleLinkedList {
    private Node first; //referencia al primer nodo de la lista enlazada

    //Constructor con el primer elemento de la lista en null
    public SimpleLinkedList() {
        this.first = null;
    }
    
    //Insertar nodo inical (elemento a la lista)
    public void push(Object obj){
        //Este nuevo nodo será la cabeza de la lista enlazada simple.
        Node newNode = new Node(obj);
        //Ahora el nuevo nodo creado es el primero (apunta primero a first y luego a newNode sera el nuevo first)
        newNode.setNext(this.first);
        this.first = newNode;
    }
    
    //Modificar nodo
    public Node insert(Object value, Object newValue){
        Node newNode = new Node(newValue);
        Node currentNode = this.first;
        
        while(!currentNode.value().equals(value)){
            if(currentNode.next() == null){
                return null;
            } else{
                currentNode = currentNode.next();
            } 
        }
        
        newNode.setNext(currentNode.next());
        currentNode.setNext(newNode);
        
        return newNode;
    }
    
    //Sacar nodo mas reciente
    public Node pop(){
        Node temp = this.first; //Guardar referencia al primer nodo en la variable tem
        this.first = this.first.next();
        
        return temp;
    }
    
    //Eliminar nodo
    public Node delete(Object val){
        Node currentNode = this.first;
        Node previousNode = this.first;
        
        //Se hace el ciclo siempre y cuando no se encuentre el valor a eliminar
        while(!currentNode.value().equals(val)){
            if(currentNode.next() == null){
                return null;
            } else{
                previousNode = currentNode;
                currentNode = currentNode.next();
            }  
        }
        
        if(currentNode == this.first){
            this.first = this.first.next();
        } else{
            previousNode.setNext(currentNode.next());
        }
        
        return currentNode;
    }
    
    //Verificar Si la lista esta vacia
    public boolean isEmpy(){
        return this.first == null;
    }
    
    //Verificar si un valor existe o no
    public Node contains(Object val){
        Node currentNode = this.first;
        
        while(!currentNode.value().equals(val)){
            if(currentNode.next() == null){
                return null;
            } else{
                currentNode = currentNode.next();
            }  
        }
        
        return currentNode;
    }
    
    //Imprimir toda la lista enlazada
    public void printContent(){
        Node currentNode = first;
        
        System.out.println("######## Mostrar lista enladaza Simple completa ########");
        while(currentNode != null){
            currentNode.showContent();
            currentNode = currentNode.next();
        }
    }
}
