
package RuntimeException;

import static RuntimeException.Aritmetica.division;

public class TestAritmetica {

    public static void main(String[] args) {

        //division entre 0 || Exception in thread "main" java.lang.ArithmeticException: / by zero
        int resultado = 0;

        // Termina de manera abrupta y se reporta el error de manera abrupto
        resultado = division(10, 0);

        System.out.println("resultado = " + resultado);
    }
}
