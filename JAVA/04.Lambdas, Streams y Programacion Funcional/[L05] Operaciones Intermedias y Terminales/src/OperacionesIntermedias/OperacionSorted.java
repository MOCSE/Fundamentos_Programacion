package OperacionesIntermedias;

import Clases.Empleado;
import java.util.Arrays;
import java.util.List;

public class OperacionSorted {
    public static void main(String[] args) {
        //Permite ordenar los elementos de un Stream
        
        System.out.println("Nombres ordenados: ");
        Arrays.asList("Alfredo","Maria","Daniel","Brenda").stream()
                .sorted()
                .forEach(System.out::println);
        
        System.out.println("\nNumeros ordenados: ");
        Arrays.asList(1,2,5,31,3,433,454,6,1,10,0,32,21,223,21,1,2,3,4,5).stream()
                .sorted()
                .forEach(System.out::println);
        
        System.out.println("\nEmpleados ordenados: ");
        List<Empleado> empleados = Empleado.empleados();
        empleados.stream()
                .sorted()
                .forEach(emp -> System.out.println(emp.getNombre()));
        
        
    }
}
