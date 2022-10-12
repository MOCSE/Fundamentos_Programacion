
package Exception;

import static Exception.Aritmetica.division;

public class TestAritmetica {
    public static void main(String[] args) {
        
        //division entre 0 || Exception in thread "main" java.lang.ArithmeticException: / by zero
        
        int resultado = 0;
        
        // try-catch || Intentar recuperar de algun error/Excepcion para que el programa no termine de manera abrubta
        try {
           resultado = division(10, 0);
        } catch (OperacionExcepcion e) {
            System.out.println("Ocurrio Un ERROR");
            e.printStackTrace(System.out); //Imprimir pila de excepciones
            System.out.println(e.getMessage()); //Mandar a imprimir el mensaje de manera individual
        }
        
        System.out.println("resultado = " + resultado);
    }
}
