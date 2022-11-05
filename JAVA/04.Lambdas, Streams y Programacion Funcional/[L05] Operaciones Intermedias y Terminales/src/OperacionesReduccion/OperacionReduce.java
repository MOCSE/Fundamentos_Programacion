package OperacionesReduccion;

import java.util.stream.IntStream;

public class OperacionReduce {
    public static void main(String[] args) {
        int [] numeros = {1,2,5,31,3,433,454,6,1,10,0,32,21,223,21,1,2,3,4,5};
        
        //Reduce los elementos de un Stream en un solo valor mediante alguna funcion
        int suma = IntStream.of(numeros)
                .reduce(0, (num1,num2) -> num1 + num2);
        System.out.println(suma);
    }
}
