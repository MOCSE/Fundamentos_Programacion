package contadordecaracteres;

import java.util.Scanner;

public class ContadorDeCaracteres {

    public static void main(String[] args) {
        String[] arrayCadenas = {"abc", "Oscar","Programacion","resta","abc22@22323XD"};
        
        
        Scanner in = new Scanner(System.in);
        System.out.println("Cadena: ");
        String cadena = in.nextLine();
        System.out.println("Caracter a contar");
        char caracter = in.nextLine().charAt(0);
        
        System.out.println("Nunero de caracteres encontrados: " + countChar(cadena, caracter));
        System.out.println("Numero de caracteres encontrados en Array: " + countChar(arrayCadenas, caracter));
    }
    
    public static int countChar(String cadena, char chr){
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if(cadena.charAt(i) == chr)
                contador++;
        }
        return contador;
    }
    
    public static int countChar(String[] array, char chr){
        int contador = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length(); j++) {
                if(array[i].charAt(j) == chr)
                    contador++;
            }
        }
        return contador;
    }
}
