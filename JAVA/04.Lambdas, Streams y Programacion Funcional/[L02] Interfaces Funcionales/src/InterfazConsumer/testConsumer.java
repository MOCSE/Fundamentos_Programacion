package InterfazConsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class testConsumer {
    public static void main(String[] args) {
        
        //No retorna nada pero hace todo lo que este dentro del argumento lambda
        Consumer<String> cons = x -> System.out.println(x);
        cons.accept("Hola Mundo desde Lambdas kk");
        
        //Ejemplo Mas complejor:)
        List<Estudiante> estudiantes = Arrays.asList(
                new Estudiante ("John",6),
                new Estudiante ("Mark",5),
                new Estudiante ("Felix",5),
                new Estudiante ("Patrick",6),
                new Estudiante ("James",3),
                new Estudiante ("Paul",10),
                new Estudiante ("Oscar",4),
                new Estudiante ("Maria",1),
                new Estudiante ("Nancy",9),
                new Estudiante ("Martin",3));
        
        OperacionEstudiantes op = new OperacionEstudiantes();
        //Impresion Normal
        System.out.println("Consumer1");
        Consumer<Estudiante> cons1 = e -> System.out.println("Nombre: " + e.getNombre() + "\t Calificacion: "+ e.getCalificacion());
        op.aceptaTodos(estudiantes, cons1);
        System.out.println("-----------------------------------");
        
        //Impresion despues
        System.out.println("Consumer2");
        Consumer<Estudiante> cons2 = e -> e.setCalificacion(e.getCalificacion()*1.15);
        op.aceptaTodos(estudiantes, cons2); //cons2 sume 1.15 la calificacion
        op.aceptaTodos(estudiantes, cons1); //cons1 Imprime
        System.out.println("-----------------------------------");
        
        //Combinacion entre 2 Consumer
        System.out.println("Consumer3");
        Consumer<Estudiante> cons3 = cons2.andThen(cons1);
        op.aceptaTodos(estudiantes, cons3);
    }
    
}
