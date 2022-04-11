package Predicate_mas_Bifuction;

import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        //Ejemplo con Listas
        List<Empleado> listaEmpleados
                = Arrays.asList(
                        new Empleado("Javier", 25, 2563.6, "Cobranzas"),
                        new Empleado("Arturo", 30, 1500.89, "Ventas"),
                        new Empleado("Acevedo", 20, 1232.12, "Ventas"),
                        new Empleado("Jimena", 19, 2563.6, "Mostrador"),
                        new Empleado("Raul", 25, 1111.6, "Marketing"));
        
        Evaluador evaluador = new Evaluador();
        
        System.out.println("Empleados Jovenes: ");
        List<Empleado> empleadosJovenes = evaluador.evaluar(listaEmpleados, 
                (empleado) -> empleado.getEdad() < 24);
        
        for (Empleado empleado : empleadosJovenes) {
            System.out.println(empleado.getNombre());
        }
        
        //Predicate + Bifuction
        Funciones func = new Funciones();
        for (Empleado empleado : empleadosJovenes) {
            double nuevoSalario = func.incrementoSalario(empleado, 10, 
                    (salario, incremento) -> salario + (salario * (incremento/100)));
            
            empleado.setSalario(nuevoSalario);
        }
        
        for (Empleado empleado : empleadosJovenes) {
            System.out.println("Nombre: " + empleado.getNombre() + " | Salario: " + empleado.getSalario());
        }
    }
}
