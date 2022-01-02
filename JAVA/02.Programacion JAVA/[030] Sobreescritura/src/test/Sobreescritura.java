
//Sobreescritura (Overriding) || Es un metodo de una clase hija que modifica el comportamiento de la clase padre, es decir que lo sobreescribe

package test;

import domain.Gerente;

public class Sobreescritura {

    public static void main(String[] args) {
        
        //Metodo con sobreescritura
        Gerente gerente1 = new Gerente("Juan", 5000, "Sistemas");
        System.out.println("gerente1 = " + gerente1.obtenerDetalles());
        
    }
    
}
