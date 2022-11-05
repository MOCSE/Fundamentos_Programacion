package OperacionesIntermedias;

import Clases.Empleado;
import java.util.List;
import java.util.stream.IntStream;

public class OperacionMap {
    public static void main(String[] args) {
        // Produce un stream en el que cada elemento del stream original está 
        // asociado a un nuevo valor (Aplicar una funcion a cada elemento del Stream)
        
        IntStream.rangeClosed(1, 10)
                .map(n -> n * 2)
                .forEach(System.out::println);
        
        List<Empleado> empleados = Empleado.empleados();
        
        System.out.println("Promedio e ingresos de personal femenino mayor de 25 años");
        double suma = empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .mapToDouble(emp -> emp.getIngresos())
                .sum();
        
        double promedio = suma / empleados.stream()
                .filter(emp -> emp.esMujer())
                .filter(emp -> emp.getEdad() > 25)
                .count();
        
        System.out.println("El promedio es: " + promedio);
    }
}
