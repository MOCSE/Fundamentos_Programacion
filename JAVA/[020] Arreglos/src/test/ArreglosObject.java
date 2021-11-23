
package test;

import domain.Persona;

public class ArreglosObject {
    public static void main(String[] args) {
        
        //Arreglos tipo objetos || se recomienda declararse en plural
        Persona personas[] = new Persona[2];
        
        //Modificaciones de valores
        personas[0] = new Persona("Carlos");
        personas[1] = new Persona("Pedro");
        
        //imprimir Objetos
        System.out.println("personas[0] = " + personas[0]);
        System.out.println("personas[1] = " + personas[1]);
        
        //Iteracion de elementos en el arreglo
        for (int i = 0; i < personas.length; i++) {
            System.out.println("Iteracion elemento[" + i + "] : " + personas[i]);
        }
    }
}
