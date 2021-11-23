
package pkg3tiposdatosprimitivos_ejercicio;

import java.util.Scanner;

public class TiposDatosPrimitivos_Ejercicio {

    public static void main(String[] args) {
        
        Scanner consola = new Scanner(System.in);
        
        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        int Id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());
        
        System.out.println(nombre + " #" + Id);
        System.out.println("Precio: $"+ precio);
        System.out.println("Envio Gratuito: "+envioGratuito);
    }  
}
