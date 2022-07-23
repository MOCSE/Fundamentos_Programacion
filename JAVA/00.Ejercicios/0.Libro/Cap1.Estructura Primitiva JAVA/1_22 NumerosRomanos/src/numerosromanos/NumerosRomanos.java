package numerosromanos;

import java.util.Scanner;

public class NumerosRomanos {
    
    public static String cadena="";
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String number = teclado.nextLine();
        
        convertirRomano(number);
        
    }
    
    public static void convertirRomano(String number){
        switch (number.length()) {
            case 1 -> cadena += numero(number.charAt(0));
            case 2 -> {
                cadena += decimas(number.charAt(0));
                cadena += numero(number.charAt(1));
            }
            case 3 -> {
                cadena += centenas(number.charAt(0));
                cadena += decimas(number.charAt(1));
                cadena += numero(number.charAt(2));
            }
            case 4 -> {
                cadena += milenas(number.charAt(0));
                cadena += centenas(number.charAt(1));
                cadena += decimas(number.charAt(2));
                cadena += numero(number.charAt(3));
            }
            default -> System.out.println("Numero no soportado");
            
        }
        
        System.out.println("Romano: " + cadena);
    }
    
    public static String numero(char numero){
        return switch (numero) {
            case '0' -> "";
            case '1' -> "I";
            case '2' -> "II";
            case '3' -> "III";
            case '4' -> "IV";
            case '5' -> "V";
            case '6' -> "VI";
            case '7' -> "VII";
            case '8' -> "VIII";
            case '9' -> "IX";
            default -> null;
        };
    }
    
    public static String decimas(char numero){
        return switch (numero) {
            case '0' -> "";
            case '1' -> "X";
            case '2' -> "XX";
            case '3' -> "XXX";
            case '4' -> "XL";
            case '5' -> "L";
            case '6' -> "LX";
            case '7' -> "LXX";
            case '8' -> "LXXX";
            case '9' -> "XC";
            default -> null;
        };
    }
    
    public static String centenas(char numero){
        return switch (numero) {
            case '0' -> "";
            case '1' -> "C";
            case '2' -> "CC";
            case '3' -> "CCC";
            case '4' -> "CD";
            case '5' -> "D";
            case '6' -> "DC";
            case '7' -> "DCC";
            case '8' -> "DCCC";
            case '9' -> "CM";
            default -> null;
        };
    }
    
    public static String milenas(char numero){
        return switch (numero) {
            case '0' -> "";
            case '1' -> "M";
            case '2' -> "MM";
            case '3' -> "MMM";
            case '4' -> "/";
            case '5' -> "/";
            case '6' -> "/";
            case '7' -> "/";
            case '8' -> "/";
            case '9' -> "/";
            default -> null;
        };
    }
}
