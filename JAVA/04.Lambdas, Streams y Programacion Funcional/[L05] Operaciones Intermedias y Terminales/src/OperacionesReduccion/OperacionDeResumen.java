package OperacionesReduccion;

import java.util.stream.IntStream;

public class OperacionDeResumen {
    public static void main(String[] args) {
        //Permite hacer todas las operaciones basicas en una sola pasada
        
        System.out.println(IntStream.rangeClosed(1, 20)
                .summaryStatistics());
        
        System.out.println(IntStream.rangeClosed(1, 20)
                .summaryStatistics().getMax());
        
        System.out.println(IntStream.rangeClosed(1, 20)
                .summaryStatistics().getSum());
    }
}
