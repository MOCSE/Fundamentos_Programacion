package Matriz;

import ClasesAux.NumerosRandom;

public class Matriz {
    
    private int matriz[][];
    private final int filas;
    private final int columnas;

    public Matriz(int filas, int columas) {
        this.filas = filas;
        this.columnas = columas;
        this.matriz = new int[this.filas][this.columnas];
    }
    
    public void generarMatriz(){
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                this.matriz[i][j] = NumerosRandom.getInt(0, 999);
            }
        }
        
        System.out.println("Se genero Correctamente la Matriz");
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(this.matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public void imprimirMatrizFormato(){
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(String.format("%03d", this.matriz[i][j]) + " ");
            }
            System.out.println();
        }
    }
    
}
