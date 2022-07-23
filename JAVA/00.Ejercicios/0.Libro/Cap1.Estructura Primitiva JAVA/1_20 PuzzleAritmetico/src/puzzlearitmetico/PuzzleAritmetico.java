package puzzlearitmetico;

import java.util.Scanner;

public class PuzzleAritmetico {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String palabra1 = teclado.nextLine();
        System.out.println("+");
        String palabra2 = teclado.nextLine();
        
        palabraSecreta(palabra1, palabra2);
    }
    
    public static void palabraSecreta(String palabra1, String palabra2){
        char letras[] = {'A','W','N','R','E','L','K','I','M','S'};
        char valorString[] = {'1','2','3','4','5','6','7','8','9','0'};
        String numeroString1 = "",numeroString2 = "",palabraFinal="";
        
        palabra1 = palabra1.toUpperCase();
        palabra2 = palabra2.toUpperCase();
        
        for (int i = 0; i < palabra1.length(); i++) {
            for (int j = 0; j < letras.length; j++) {
                if(palabra1.charAt(i) == letras[j])
                    numeroString1 += valorString[j];
            }
        }
        for (int i = 0; i < palabra2.length(); i++) {
            for (int j = 0; j < letras.length; j++) {
                if(palabra2.charAt(i) == letras[j])
                    numeroString2 += valorString[j];
            }
        }
        
        int sumaPalabras = Integer.parseInt(numeroString1) + Integer.parseInt(numeroString2);
        String palabra = String.valueOf(sumaPalabras);
        
        for (int i = 0; i < palabra.length(); i++) {
            for (int j = 0; j < letras.length; j++) {
                if(palabra.charAt(i) == valorString[j])
                    palabraFinal += letras[j];
            }
        }
        
        System.out.println("-----\n" + palabraFinal);
    }
    
}
