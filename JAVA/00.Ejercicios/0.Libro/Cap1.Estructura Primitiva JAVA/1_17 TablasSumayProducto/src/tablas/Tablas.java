
package tablas;

import java.util.Scanner;

public class Tablas {


    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Tabla De Suma y Multiplicacion De: ");
        int number = teclado.nextInt();
        
        System.out.println("Tabla Sumas:");
        for (int i = 0; i <= 10; i++) 
            System.out.println(number + " + " + i + " = " + (number+i));
        System.out.println("Tabla Multiplicacion:");
        for (int i = 0; i <= 10; i++) 
            System.out.println(number + " * " + i + " = " + (number*i));
    }
    
}
