package PasoPorReferencia;

import clases.Persona; //importar clases de otro paquete

public class PasoPorReferencia {
    public static void main(String[] args) {
        
        //PasoPorReferencia || Como ambas variables apuntantan al mismo objeto es posible modificar el objeto de metodo a metodo - Usando Objetos
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("Persona1 nombre = " + persona1.nombre);
        cambiaValor(persona1);
        System.out.println("Persona1 cambio nombre = " + persona1.nombre);
    }
        
    
    public static void cambiaValor(Persona persona){ //El objeto le pasa la referencia de memoria al parametro.
        persona.nombre = "Karla";
    }
}
