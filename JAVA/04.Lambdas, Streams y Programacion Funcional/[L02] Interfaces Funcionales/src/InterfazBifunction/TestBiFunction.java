package InterfazBifunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

public class TestBiFunction {
    public static void main(String[] args) {
        
        // Representa una función que acepta dos argumentos y produce 
        // un resultado. Esta es la especialización de dos aridades de Function.
        BiFunction<String, String, String> bi = (x,y) -> x + y;
        System.out.println(bi.apply("Hola", " Mundo"));
        
        // Test Objetos
        Calculadora calculadora = new Calculadora();
        String res = calculadora.calcular((x,y) -> ": " + (x*y), 60, 10);
        System.out.println("Resultado: " + res);
        System.out.println("Espacio String: " + res.length()  + "\n" );
        
        // Test Listas
        List<Empleado> listaEmpleados = Arrays.asList(new Empleado("Javier",2563.6),
                new Empleado("Arturo",33.99),
                new Empleado("Carlos",2211.6),
                new Empleado("Jimena",456.623),
                new Empleado("Raul",123.1));
        
        Calculadora2 cal = new Calculadora2();
        List<Double> salarios = cal.calcular((salario, incremento) -> 
                salario + (salario * (incremento/100)), listaEmpleados, 16.0);
        
        for (Double salario : salarios) {
            System.out.println(salario);
        }
    }
}
