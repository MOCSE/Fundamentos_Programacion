
package paquete1;

//Clase publica || Esta clase puede ser utilizada en el mismo paquete o uno externo (en cualquier parte del proyecto)
public class Clase_public {
    
    //Atributo publico || Se puede acceder directamente a este atributo desde otra clase
    public String atributoPublico = "Valor Atriburo Publico";
    
    //Constructor publico || Se puede llamar cuando se crea el objeto desde otra clase sin restricciones
    public Clase_public() {
        System.out.println("Constructor publico");
    }
    
    //Metodo publico || Se puede acceder/llamar en cualquier otra clase
    public void metodoPublico(){
        System.out.println("Metodo Publico\n");
    }
    
}
