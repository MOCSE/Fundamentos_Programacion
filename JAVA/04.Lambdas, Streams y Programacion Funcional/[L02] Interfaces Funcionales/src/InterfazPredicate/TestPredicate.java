package InterfazPredicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
 
public class TestPredicate {

    public static void main(String[] args) {
        //Representa un predicado (función de valor booleano) de un argumento.
        Predicate<Integer> predicate = (valor) -> valor > 0;
        System.out.println(predicate.test(123));

        //Ejemplo con Listas
        List<Empleado> listaEmpleados 
                = Arrays.asList(
                new Empleado("Javier", 25, 2563.6,"Cobranzas"),
                new Empleado("Arturo", 30, 1500.89, "Ventas"),
                new Empleado("Acevedo", 20, 1232.12, "Ventas"),
                new Empleado("Jimena", 19, 2563.6, "Mostrador"),
                new Empleado("Raul", 25, 1111.6, "Marketing"));
        
        Evaluador evaluador = new Evaluador();
        
        System.out.println(" Empleados con salarios mayor a 2000");
        List<Empleado> empSalariosAltos = evaluador.evaluar(listaEmpleados, 
                (empleado) -> empleado.getSalario() > 2000);
        
        for (Empleado empleado : empSalariosAltos) {
            System.out.println(empleado.getNombre());
        }
        
        System.out.println("\n Empleados que inician con A");
        List<Empleado> empInicianConA = evaluador.evaluar(listaEmpleados, 
                (empleado) -> empleado.getNombre().startsWith("A"));
        
        for (Empleado empleado : empInicianConA) {
            System.out.println(empleado.getNombre());
        }
    }
}
