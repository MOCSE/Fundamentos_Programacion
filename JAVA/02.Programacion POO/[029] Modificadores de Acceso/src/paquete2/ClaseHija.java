
package paquete2;

import paquete1.Clase_protected;

public class ClaseHija extends Clase_protected{
    
    //Constructor protected (Clase Hija)
    public ClaseHija(){
        super(); //Se llama el contructor protegido de la clase padre
        this.atributoProtected = "Modificar atributo protected";
        System.out.println("atributoProtegido = " + atributoProtected );
        this.metodoProtected();
    }
   
}
