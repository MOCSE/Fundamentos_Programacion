
//Trabajar con los propios tipos de excepciones

package Exception;

//Debe extender de alguna clase heredada de excepciones
//Exception -> Requiere de tryCatch para dar informe de la excepcion - Checked Exceptions
        //Usar solo si estamos seguros de las expeciones que puedan suceder 

public class OperacionExcepcion extends Exception{

    public OperacionExcepcion(String message) {
        super(message);
    }
    
    
    
}
