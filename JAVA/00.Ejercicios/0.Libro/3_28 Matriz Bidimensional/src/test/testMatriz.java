package test;

import Matriz.Matriz;

public class testMatriz {

    public static void main(String[] args) {
        Matriz matriz = new Matriz(3,5);
        matriz.generarMatriz();
        System.out.println("Imprimiendo Matriz Sin Formato");
        matriz.imprimirMatriz();
        System.out.println("Imprimiendo Matriz Con Formato");
        matriz.imprimirMatrizFormato();
    }
    
}
