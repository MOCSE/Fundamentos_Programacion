/* Una excepciónes una situación no esperada en la ejecución de un programa.

   Existen muchas clases de Excepciones ya creadas en el API de Java para resolver varios de los problemas mencionados, pero si no existe la clase
    que se adecue a nuestras necesidades nosotros podemos crear nuestras propias clases de excepción.

   La clase padre de todas las excepciones es la clase Throwable, pero no se usa, asi que se considera padre a la clase Exception
        Throwable
        Exception
        RuntimeException || SQLException (Solo ocurren en tiempo de ejecucion)
        NullPointerException
*/
package test_tryCatch;

public class TestExepciones {
    public static void main(String[] args) {
        
        //division entre 0 || Exception in thread "main" java.lang.ArithmeticException: / by zero
        
        int resultado = 0;
        
        // try-catch || Intentar recuperar de algun error/Excepcion para que el programa no termine de manera abrubta
        try {
           resultado = 10/0; 
        } catch (Exception e) { //Se puede Ejecutar mas expeciones usando más catch (se ejecuta las expeciones de mayor jerarquia)
            System.out.println("Ocurrio Un ERROR");
            e.printStackTrace(System.out); //Imprimir pila de excepciones
            System.out.println(e.getMessage()); //Mandar a imprimir el mensaje de manera individual
        }
        finally{ //finally - Cerrar recursos | Siempre se va a ejecutar independiente de que ocurra una excepcion o no
            System.out.println("Se reviso la division entre cero");
        }
        
        System.out.println("resultado = " + resultado);
    }
}
