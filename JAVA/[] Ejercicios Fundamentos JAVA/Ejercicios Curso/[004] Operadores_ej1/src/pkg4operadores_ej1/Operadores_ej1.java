
package pkg4operadores_ej1;

import java.util.Scanner;

public class Operadores_ej1 {

    public static void main(String[] args) {
        int alto, ancho, area, perimetro ;
        Scanner consola = new Scanner(System.in);
        
        System.out.print("Proporciona el alto: ");
        alto = Integer.parseInt(consola.nextLine());
        System.out.print("Proporciona el ancho: ");
        ancho = Integer.parseInt(consola.nextLine());
        
        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        
        System.out.println("area = " + area);
        System.out.println("perimetro = " + perimetro);
    }
    
}
