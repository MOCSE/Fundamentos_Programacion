
package test;

public class Arreglos {
    public static void main(String[] args) {
        
        //Arreglos tipo entero || se recomienda declararse en plural
        int edades[] = new int[3];
        
        //Modificaciones de valores
        edades[0] = 10;
        System.out.println("edades[0] = " + edades[0]);
        
        //Iteracion de elementos en el arreglo
        for (int i = 0; i < edades.length; i++) {
            System.out.println("edades elemento[" + i + "] : " + edades[i]);
        }
        
        //Sintaxis resumida || inicializar arreglos (tanto para datos primitivos como para objetos)
        String frutas[] = {"Naranja", "Platano", "Uva"};
        for (int i = 0; i < frutas.length; i++) {
            System.out.println("FRUTAS [" + i + "] : " + frutas[i]);
        }
        
        
    }
}
