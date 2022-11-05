package OperacionesIntermedias;

import Clases.Empleado;
import java.util.List;
import java.util.function.Predicate;

public class OperacionFilter {

    public static void main(String[] args) {
        //Produce un stream que contiene solo elementos que satisfacen una condicion
        List<Empleado> empleados = Empleado.empleados();
        
        System.out.println("Empleados Hombres");
        empleados.stream()
                .filter(Empleado::esHombre) // empleado -> empleado.getGenero() == Empleado.Genero.HOMBRE
                .forEach(empleado -> System.out.println(empleado));
        
        System.out.println("\nEmpleados Mujeres");
        empleados.stream()
                .filter(Empleado::esMujer)
                .forEach(empleado -> System.out.println(empleado));
        
        System.out.println("\nEmpleados Mayores de 25 años");
        empleados.stream()
                .filter(empleado -> empleado.getEdad() > 25)
                .forEach(empleado -> System.out.println(empleado));
        
        System.out.println("\nEmpleados Hombres Cuya letra comienza con 'A'");
        empleados.stream()
                .filter(Empleado::esHombre)
                .filter(empleado -> empleado.getNombre().startsWith("A"))
                .forEach(empleado -> System.out.println(empleado));
        
        System.out.println("\nEmpleados Hombres que gana arriba de 500");
        empleados.stream()
                .filter(empleado -> empleado.getIngresos() > 500 && empleado.esHombre())
                .forEach(empleado -> System.out.println(empleado));
        
        System.out.println("\nEmpleados Mujeres mayores de 25 años con ingresos por encima de los 300");
        Predicate<Empleado> empFemenino = emp -> emp.esMujer();
        Predicate<Empleado> emMayor25 = emp -> emp.getEdad() > 25;
        Predicate<Empleado> empMayor300 = emp -> emp.getIngresos() > 300;
        Predicate<Empleado> fem25300 = empFemenino.and(emMayor25.and(emMayor25));
        empleados.stream()
                .filter(fem25300)
                .forEach(empleado -> System.out.println(empleado));
    }
    
}
