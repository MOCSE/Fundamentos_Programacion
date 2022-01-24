
// Private || Solo pueden ser accedidos dentro de la clase

package paquete1;

//NO APLICA EN CLASES
public class Clase_Private {
    
    //Atributo Private || No se puede modificar el atributo desde otra clase (Para poder acceder, se debe usar encapsulamiento)
    private String atributoProtected = "Valor Atriburo Private";
    
    //Constructor Private || Solo se puede utilizar dentro de esta clase para crear objetos con este constructor
    private Clase_Private() {
        System.out.println("Constructor Private");
    }
    
    //Metodo Private || Solo se puede utilizar dentro de esta clase para usar el metodo
    private void metodoPrivate(){
        System.out.println("Metodo Private");
    }
}
