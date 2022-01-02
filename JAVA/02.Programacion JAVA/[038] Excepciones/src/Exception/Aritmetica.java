
package Exception;

import Exception.OperacionExcepcion;


public class Aritmetica {
    
    //throws || Posible Excepcion que puede arrojar
    public static int division(int numerador, int denominador) throws OperacionExcepcion {
        
        if(denominador == 0)
            throw new OperacionExcepcion("Division entre cero"); //throw || Arrojar una Excepcion
                    
        return numerador/denominador;              
    }
}
