package maximodeconjuntos;

import java.util.ArrayList;
import java.util.ListIterator;

public class MaximoDeConjuntos {
    public static void main(String[] args) {
        int[] arrayEnteros = {10,20,2,3,4,5};
        int[][] matrizEnteros = {{12,2,23},{1,2,1},{33,9,6},{1,200,23},{9,11,2}};
        String[] arrayCadenas = {"abc", "Oscar","Programacion","resta"};
        ArrayList<String> listaCadenas = new ArrayList<>();
        listaCadenas.add("Cadena1XD");
        listaCadenas.add("Cadena2");
        listaCadenas.add("sosaldsnakdnkadmak");
        
        max(arrayEnteros);
        max(matrizEnteros);
        max(arrayCadenas);
        max(listaCadenas);
    }
    
    public static void max(int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++)
            if(array[i] > max)
                max = array[i];
        System.out.println("Maximo Arreglo: " + max);
    }
    
    public static void max(int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if(array[i][j] > max)
                    max = array[i][j];
            }
        }
        System.out.println("Maximo Matriz: " + max);
    }
    
    public static void max(String[] array){
        int max = array[0].length();
        String maxCadena = "";
        for (int i = 0; i < array.length; i++) {
            if(array[i].length() > max){
                maxCadena = array[i];
                max = array[i].length();
            }
        }
        System.out.println("Maximo Cadena: " + maxCadena);
    }
    
    public static void max(ArrayList<String> array){
        String cadenaMax = array.get(0);
        int max = cadenaMax.length();
        String maxCadena ="";
        
        ListIterator<String> iterador = array.listIterator();
        while(iterador.hasNext()){
            cadenaMax = iterador.next();
            if(cadenaMax.length() > max){
                maxCadena = cadenaMax;
                max = cadenaMax.length();
            }
        }
        
        System.out.println("Lista Cadena Maxima: " + maxCadena);
    }
}
