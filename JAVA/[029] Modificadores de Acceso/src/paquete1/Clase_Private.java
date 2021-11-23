
// Private || Solo pueden ser accedidos dentro de la clase

package paquete1;

//NO APLICA EN CLASES
public class Clase_Private {
    
    //Atributo Private 
    private String atributoProtected = "Valor Atriburo Private";
    
    //Constructor Private
    private Clase_Private() {
        System.out.println("Constructor Private");
    }
    
    //Metodo Private
    private void metodoPrivate(){
        System.out.println("Metodo Private");
    }
}
