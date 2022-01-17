
package Listas01_03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Listas02_BusquedaDuplicados {
    
//    Escribe un programa que contenga un método que acepte como parámetro una 
//    lista de números enteros mayores que 0, pudiendo contener elementos 
//    duplicados. Este método debe sustituir cada valor repetido por 0. Para terminar, 
//    realiza un método muestre el array modificado. Nota: Necesitarás otro método 
//    para rellenar la lista de enteros. Le irá pidiendo números al usuario hasta que este introduzca un número negativo.
//Ejemplo: 2 7 8 4 5 8 7 1  || 2 0 0 4 5 0 0 1
    
    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        
        ingresarNumeros(listaEnteros);
        imprimirLista(listaEnteros);
        sustituirValores(listaEnteros);
        imprimirLista(listaEnteros);
    }
    
    public static List<Integer> ingresarNumeros(List<Integer> listaEnteros){
        Scanner teclado = new Scanner(System.in);
        int num = 0;
        do {
            System.out.print("Ingresa un numero: ");
            num = teclado.nextInt();
            if(num >= 0)
                listaEnteros.add(num);
        } while (num >= 0);
        
        return  listaEnteros;
    }
    
    public static List<Integer> sustituirValores(List<Integer> listaEnteros){
        boolean aux2 = false;
        
        for (int i = 0; i < listaEnteros.size(); i++) {
            for (int j = 0; j < listaEnteros.size(); j++) {
                int aux = listaEnteros.get(i);
                if(i != j &&  (listaEnteros.get(j) == aux)){
                    listaEnteros.set(j, 0);
                    aux2 = true;
                }    
            }
            if(aux2){
                listaEnteros.set(i, 0);
                aux2 = false;
            }
        }
        return listaEnteros;
    }
    
    public static void imprimirLista(List<Integer> listaEnteros){
        System.out.println(listaEnteros);
    }
}

