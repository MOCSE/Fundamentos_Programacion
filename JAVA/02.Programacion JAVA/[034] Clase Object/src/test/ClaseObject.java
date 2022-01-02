
//Clase Object || Clase Rair de todas las clases de java
    
    /* Metodos más basicos de la clase Object

            +toString(): String
            +equals(): boolean
            +hashCode(): int    
    */      

package test;

import domain.*;

public class ClaseObject {

    public static void main(String[] args) {
     
        Empleado empleado1 = new Empleado("Juan", 5000);
        Empleado empleado2 = new Empleado("Juan", 5000);
        
        //Ver si tiene la misma referencia los objetos
        if(empleado1 == empleado2)
            System.out.println("Tienen la misma referencia en memoria");
        else
            System.out.println("Tienen Distinta referencia en memoria");
        
        //equals() || Compara si 2 objetos son iguales
        if(empleado1.equals(empleado2))
            System.out.println("Tienen El mismo contenido");
        else
            System.out.println("Tienen Diferente contenid");
        
        //hashCode() || Asigna un nuemero aleatorio al objeto
        Empleado empleado3 = new Empleado("Karla", 5000);
        System.out.println("HashCode empleado1 : " +empleado1.hashCode());
        System.out.println("HashCode empleado2 : " +empleado2.hashCode());
        System.out.println("HashCode empleado3 : " +empleado3.hashCode());
    }
}
