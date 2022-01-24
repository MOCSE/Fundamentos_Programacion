
//Trabajar con los propios tipos de excepciones

package RuntimeException;

//Debe extender de alguna clase heredada de excepciones
//RuntimeExcepcion -> No Requiere de tryCatch para dar informe de la excepcion - Uncheked Exceptions 
        //Limpian mas el codigo
public class OperacionRuntimeException extends RuntimeException{

    public OperacionRuntimeException(String message) {
        super(message);
    }
    
    
    
}
