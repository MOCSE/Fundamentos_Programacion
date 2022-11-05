package InterfazBiPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

public class TestBiPredicate {

    public static void main(String[] args) {

        //Funcionamineto Basico
        BiPredicate<Integer, Integer> bp = (x, y) -> x < y;
        System.out.println(bp.test(2, 3));

        //Ejercicio Complejo
        List<Empleado> listaEmpleados
                = Arrays.asList(
                        new Empleado("Javier", 25, 2563.6, "Cobranzas"),
                        new Empleado("Arturo", 30, 1500.89, "Ventas"),
                        new Empleado("Acevedo", 20, 1232.12, "Ventas"),
                        new Empleado("Jimena", 19, 2563.6, "Mostrador"),
                        new Empleado("Rodrigo", 25, 1500, "Ventas"),
                        new Empleado("Alicia", 25, 2500, "Telemarketing"),
                        new Empleado("Manolo", 30, 7000, "Mostrador"),
                        new Empleado("Esteban", 20, 600, "Ventas"),
                        new Empleado("Lina", 36, 2500, "Compras"),
                        new Empleado("Flor", 52, 7000, "Facturacion"));

        /*
            Se re quiere obtener un reporte con todos los empleados que cumpa con
            algunos de estos 2 conjuntos de criterios:
                1.- 25 años en adelante y que esten en el departamento de Ventas o
                2.- 25 años en adelante t que esten en mostrador
         */
        Evaludador evaluador = new Evaludador();
        System.out.println("Empleados de mostrador o ventas, mayores de 25 años: ");

        BiPredicate<Integer, String> primerCriterio = (edad, departamento) -> (edad >= 25) && (departamento.equals("Ventas"));
        BiPredicate<Integer, String> segundoCriterio = (edad, departamento) -> (edad >= 25) && (departamento.equals("Mostrador"));

        //Cualquiera cumple el criterio con "or"
        BiPredicate<Integer, String> criterio = primerCriterio.or(segundoCriterio);
        List<Empleado> listaActualizada = evaluador.evaluar(listaEmpleados, criterio);
        for (Empleado empleado : listaActualizada) {
            System.out.println(empleado);
        }
    }

}
