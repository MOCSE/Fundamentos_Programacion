
package test;

import domain.Persona;

public class Matrices {
    public static void main(String[] args) {
        //Primer indice -> filas , segundo indice -> columnas

        //Matriz tipo entero || se recomienda declararse en plural
        int edades [][] = new int[3][2]; //3 Filas - 2 Columnas

        //Modificaciones de valores
        edades[0][0] = 5;
        edades[0][1] = 7;
        edades[1][0] = 8;
        edades[1][1] = 4;
        
        //imprimir matrices
        System.out.println("edades[0][0] = " + edades[0][0]);
        System.out.println("edades[0][0] = " + edades[0][1]);
        System.out.println("edades[0][0] = " + edades[1][0]);
        System.out.println("edades[0][0] = " + edades[1][1]);
        
        //Iteracion de elementos en la matriz con ciclo for anidado
        for (int fila = 0; fila < edades.length; fila++) {
            for (int columna = 0; columna < edades[fila].length ; columna++) {
                System.out.println("Iteracion elemento[" + fila + "][" + columna + "] : " + edades[fila][columna]);
            }
        }
        
        //Sintaxis resumida || inicializar matrices (tanto para datos primitivos como para objetos)
        String frutas[][] = {{"Naranja","Limon"},{"Fresa","Zarzamora"}};
        System.out.println("");
        imprimir(frutas);
        
        
        //Matriz de Objetos
        Persona personas[][] = new Persona[2][3];
        personas[0][0] = new Persona ("Juan");
        personas[0][1] = new Persona ("Karla");
        System.out.println("");
        imprimir(personas);
        
    }
    
    //Metodo para iterar rapidamente
    public static void imprimir(Object matriz[][]){
        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[fila].length ; columna++) {
                System.out.println("FRUTA[" + fila + "][" + columna + "] : " + matriz[fila][columna]);
            }
        }
    }
    
    
}
