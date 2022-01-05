
package ListasEnlazadasSimples;

public class testSimpleLinkedList {
    public static void main(String[] args) {
        SimpleLinkedList list = new SimpleLinkedList();
        
        list.push(1.23);
        list.push("xd");
        list.push(100);
        list.printContent();
        
        Node nodo = list.insert(1.23, 666);
        list.printContent();
        
        nodo = list.contains(1.23);
        if(nodo == null){
            System.out.println("Valio, no se encontro");
        } else{
            System.out.println("Se encontro en la lista!!!");
        }
        
        System.out.println("Eliminacion de nodos");
        while(!list.isEmpy()){
            nodo = list.pop();
            System.out.println("Nodo eliminado");
            nodo.showContent();
        }
        list.printContent();
        
    }
}
