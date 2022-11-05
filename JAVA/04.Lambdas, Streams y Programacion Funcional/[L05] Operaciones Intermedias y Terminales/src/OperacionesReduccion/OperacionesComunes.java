package OperacionesReduccion;

import Clases.Empleado;
import java.util.List;
import java.util.stream.IntStream;

public class OperacionesComunes {
    public static void main(String[] args) {
        int [] numeros = {1,2,5,31,3,433,454,6,1,10,0,32,21,223,21,1,2,3,4,5};
        
        //Suma de los elementos
        System.out.println("Suma de elementos");
        int suma = IntStream.of(numeros)
                .sum();
        System.out.println(suma);
        
        //Promedio de los elementos
        System.out.println("Promedio de elementos");
        double prom = IntStream.of(numeros)
                .average().getAsDouble();
        System.out.println(prom);
        
        //Minimo y maximo
        System.out.println("Minimo y Maximo");
        int min = IntStream.of(numeros)
                .min().getAsInt();
        int max = IntStream.of(numeros)
                .max().getAsInt();
        System.out.println("min: " + min + " | max: " + max);
        
        //Contar cantidad de elementos
        System.out.println("Cantidad de Elementos");
        
        //Obtener el empleado con el salario maximo
        List<Empleado> empleados = Empleado.empleados();
        Empleado empMax = empleados.stream()
                .max((emp1,emp2) -> (int)(emp1.getIngresos() - emp2.getIngresos())).get();
        System.out.println(empMax);
        
    }
    
}
