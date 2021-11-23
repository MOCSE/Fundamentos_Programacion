package test;

import dominio.*; //importar todas las clases usando * :)

public class PersonaPrueba {
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Juan", 5000.00, false);
        
        //Recuperar datos
        System.out.println("persona1 nombre = " + persona1.getNombre());
        
        //Modificar los valores
        persona1.setNombre("Juan Carlos");
            //persona1.nombre = "Juan Carlos" Ya no es posible porq hay atributos privados
            
        //Recuperar datos
        System.out.println("persona1 nombre con cambio = " + persona1.getNombre());
        System.out.println("persona1 sueldo: " + persona1.getSueldo());
        System.out.println("persona1 eliminado: " + persona1.isEliminado());
        
        //Imprimir metodo toString || println llama solo el toString() asi que no es necesario ponerlo
        System.out.println("Metodo toString" + persona1.toString());
    }
}
