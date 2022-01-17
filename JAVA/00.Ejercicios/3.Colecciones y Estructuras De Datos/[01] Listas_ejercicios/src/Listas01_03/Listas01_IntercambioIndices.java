package Listas01_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas01_IntercambioIndices {

//    Realizar un programa que lea tantos números enteros como desee el usuario 
//    y los introduzca en una lista. Muestras la lista , intercambias los números 
//    que se encuentren en la 2ª y 4ª posición, y muestras el nuevo la lista por 
//    pantalla.Utiliza al menos 3 métodos: uno para introducir los datos ,
//    otro para mostrar los datos y otro para intercambiar los datos

    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        
        introducirDatos(listaEnteros);
        imprimirDatos(listaEnteros);
        intercambioDatos(listaEnteros);
        imprimirDatos(listaEnteros);
    }
    
    public static void introducirDatos(List<Integer> listaEnteros){
        Scanner teclado = new Scanner(System.in);
        int numEntero = 0;
        System.out.println("Introduce 0 para dejar de guardar numeros");
        
        do {
            System.out.print("Introduce un numero entero: ");
            numEntero = teclado.nextInt();
            if(numEntero != 0)
                listaEnteros.add(numEntero);
        } while (numEntero != 0);
        
    }   
    
    public static void intercambioDatos(List<Integer> listaEnteros){
        try {
          int num1 = listaEnteros.get(3);
          int num2 = listaEnteros.get(1);
          listaEnteros.set(1, num1);
          listaEnteros.set(3, num2);
        } catch (Exception e) {
            System.out.println("ERROR, NO hay suficinetes valores");
            System.exit(0);
        }
    }
    
    public static void imprimirDatos(List<Integer> listaEnteros){
        System.out.println(listaEnteros);
    }
}
