package InterfaceBiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class testInterfaceBiPredicate {

    public static void main(String[] args) {
        //Representa un predicado (función de valor booleano) de dos argumentos. 
        //Esta es la especialización de dos aridades de Predicate.
        BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
        System.out.println(bp.test(2, 3));

        //Ejemplo con Listas
        List<Empleado> listaEmpleados
                = Arrays.asList(
                        new Empleado("Javier", 25, 2563.6, "Cobranzas"),
                        new Empleado("Arturo", 30, 1500.89, "Ventas"),
                        new Empleado("Acevedo", 20, 1232.12, "Ventas"),
                        new Empleado("Jimena", 50, 2563.6, "Mostrador"),
                        new Empleado("Raul", 25, 1111.6, "Marketing"));

        Evaluador evaluador = new Evaluador();
        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> 
                (edad >= 25) && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> 
                (edad >= 25) && (departamento.equals("Mostrador"));
        BiPredicate<Integer,String> criterios = primerCriterio.or(segundoCriterio);
        
        System.out.println("Empleados Mostrador o Ventas Mayores o iguales de 25 años");
    }

}
