
package RuntimeException;



public class Aritmetica {
    
    //No hay que usar firma del metodo (throws)
    public static int division(int numerador, int denominador){
        
        if(denominador == 0)
            throw new OperacionRuntimeException("Division entre cero"); //throw || Arrojar una Excepcion
                    
        return numerador/denominador;              
    }
}
