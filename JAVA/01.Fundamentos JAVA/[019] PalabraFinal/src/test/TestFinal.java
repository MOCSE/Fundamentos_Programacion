
    /*Palabra Final en Java
        -En Variables: Evita cambiar el valor que almacena la variable
        -En Metodos:   Evita que se modifique la definicion de un método desde una subclase
        -En Clases:    Evita que se cree una subclase.
      */

package test;

import domain.Persona;

public class TestFinal {
    public static void main(String[] args) {
        
        final int miVariable = 30; //final(variable) || ya no se puede modificar la variable 
        System.out.println("miVariable = " + miVariable);
        //miVariable = 12 || esto no es posible
        
        System.out.println(Persona.MI_CONSTANTE);
        
        
        final Persona persona1 = new Persona(); //final(objeto) || ya no se puede reasignar
        //persona1 = new Persona(); || esto no es posible reasignar el objeto (nueva referencia), pero si es posible modificar el contenido al objeto que esta apuntando
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre= " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre= " + persona1.getNombre());
    }
}
