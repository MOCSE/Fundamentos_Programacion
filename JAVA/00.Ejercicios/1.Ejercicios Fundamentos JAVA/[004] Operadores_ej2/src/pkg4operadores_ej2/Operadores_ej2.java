
package pkg4operadores_ej2;

import java.util.Scanner;


public class Operadores_ej2 {

    public static void main(String[] args) {
        int numero1, numero2;
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Proporciona el numero 1: ");
        numero1 = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el numero 2: ");
        numero2 = Integer.parseInt(consola.nextLine());
        
        var res = (numero1 > numero2) ? numero1 : numero2;
        System.out.println("Numero Mayor: " + res);  
    }    
}
