package main;

import java.util.Scanner;

public class AnoBisiesto {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Año: " );
        int year = teclado.nextInt();
        
        System.out.println("Resultado:" + yearBisiesto(year));
    }
    
    
    public static boolean yearBisiesto(int year){
        return (year % 4) == 0;
    }
}
