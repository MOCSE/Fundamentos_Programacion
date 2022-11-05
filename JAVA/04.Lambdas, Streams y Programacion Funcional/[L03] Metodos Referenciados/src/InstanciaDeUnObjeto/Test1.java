package InstanciaDeUnObjeto;

import MetodoEstatico.*;
import MetodoEstatico.Persona;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<Persona> personas = Arrays.asList(
                new Persona("Juan", 18, "juanito@hotmail.com"),
                new Persona("Mario", 17, "Mario@hotmail.com"),
                new Persona("Arturo", 17, "Arturo@hotmail.com"),
                new Persona("Maria", 15, "Maria@hotmail.com"),
                new Persona("Beatriz", 15, "Beatriz@hotmail.com"),
                new Persona("Olivia", 25, "Olivia@hotmail.com"),
                new Persona("Angel", 32, "Angel@hotmail.com"),
                new Persona("Omar", 28, "Omar@hotmail.com"),
                new Persona("Pamela", 25, "Pamela@hotmail.com"),
                new Persona("Sadee", 12, "Sadee@hotmail.com"),
                new Persona("Jared", 14, "Jared@hotmail.com"),
                new Persona("Pepe", 18, "Sebastian@hotmail.com"),
                new Persona("Javier", 20, "Javier@hotmail.com"),
                new Persona("Roberto", 20, "Roberto@hotmail.com"),
                new Persona("Oyuki", 22, "Oyuki@hotmail.com"),
                new Persona("Linda", 25, "Linda@hotmail.com"),
                new Persona("Gustavo", 18, "Gustavo@hotmail.com")
        );
        
        System.out.println("Personas sin ordenar: ");
        personas.forEach(p -> System.out.println(p));
        System.out.println("");
        
        System.out.println("Personas Por edades: ");
        
        Collections.sort(personas, (persona1,persona2) -> Persona.compararPorEdad(persona1, persona2));
        personas.forEach(p -> System.out.println(p));
        
        //Cuando la expresion lambda llama a un metodo ya existente, para ahorrar codigo se usa los metodos referenciados
        System.out.println("\nPersonas Por edades CON METODO REFERENCIADO: ");
        Collections.sort(personas, Persona::compararPorEdad);
        personas.forEach(p -> System.out.println(p));
    }
}
