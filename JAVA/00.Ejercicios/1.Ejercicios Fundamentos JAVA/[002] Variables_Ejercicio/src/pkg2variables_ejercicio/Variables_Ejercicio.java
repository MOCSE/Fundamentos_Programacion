
package pkg2variables_ejercicio;

import java.util.Scanner;

public class Variables_Ejercicio {


    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.print("Proporciona el titulo: ");
        var titulo = consola.nextLine();
        System.out.print("Proporciona el autor: ");
        var autor = consola.nextLine();
        
        System.out.println(titulo + " fue escrito por " + autor);
    } 
}
