
//Protected  || la idea es permitir a las clases hijas acceder a los atributos, constructores o metodos de las clases padre

package paquete1;

//Clase protected || NO APLICA
public class Clase_protected {
    
    //Atributo protected || No se puede acceder directamente a este atributo desde otra clase, solo en subclases heredadas
    protected String atributoProtected = "Valor Atriburo Protected";
    
    //Constructor protected || Ne puede llamar cuando se crea el objeto desde otra clase sin restricciones, solo en subclases heredadas con super
    protected Clase_protected() {
        System.out.println("Constructor protected");
    }
    
    //Metodo protected || No se puede acceder/llamar en cualquier otra clase, solo en subclases heredadas
    protected void metodoProtected(){
        System.out.println("Metodo Protected");
    }
    
}
