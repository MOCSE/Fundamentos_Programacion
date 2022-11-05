package CreacionDeStreams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest {

    public static void main(String[] args) {

        //Creacion Streams Desde Valores
            //Stream con Valor
            Stream<String> stream1 = Stream.of("Curso de Programacion");
            stream1.forEach(x -> System.out.println(x)); // stream1.forEach(System.out::println);
            
            //Stream con valores
            Stream<String> stream2 = Stream.of("curso1","curso2","curso3","curso4");
            
            //Stream con arreglo
            String[] arreglo = {"Java","c++","c#","ruby"};
            Stream<String> stream3 = Stream.of(arreglo);
            
            //Stream con Objetos
            Stream<Estudiante> stream4 = Stream.<Estudiante>builder()
                    .add(new Estudiante("PEPE", 18))
                    .add(new Estudiante("Karla", 21))
                    .build();
            stream4.forEach(estudiante -> System.out.println(estudiante.getNombre()));
            
            //Stream con rangos
            IntStream unoAVeinte = IntStream.range(1, 21);
            unoAVeinte.forEach(System.out::println);
        
            
            
        //Creacion Streams Desde Funciones
            //Retorna una cantidad infinita de numeros con una semilla
            Stream<Long> primerosDiez = Stream.iterate(1L, n -> n + 1)
                    .limit(10);
            primerosDiez.forEach(System.out::println);
            
            Stream.iterate(1L, n -> n + 1)
                    .filter(n -> n % 2 == 0)
                    .limit(20)
                    .forEach(System.out::println);
            
            System.out.println("Despues de 100");
            Stream.iterate(1L, n -> n + 1)
                    .filter(n -> n % 2 == 0)
                    .skip(100)
                    .limit(5)
                    .forEach(System.out::println);
            
            //Generar numeros aleatorios
            System.out.println("Numeros Random");
            Stream.generate(Math::random)
                    .limit(5)
                    .forEach(System.out::println);
            
            System.out.println("Enteros aleatorios");
            new Random().ints()
                    .limit(5)
                    .forEach(System.out::println);
          
            
            
        //Creacion Streams Desde Colecciones y Arreglos
            //Arreglos
            IntStream numStream = Arrays.stream(new int[]{1,2,3,4,5,6});
            numStream.forEach(System.out::println);
            
            Stream<String> nombres = Arrays.stream(new String[]{"Hola","Adios"});
            
            //Colecciones | Conjutos
            Set<String> lenguajesSet = new HashSet<>(Arrays.asList("JAVA","C++","C#"));
            Stream<String> lenguajesStream = lenguajesSet.stream();
            lenguajesStream.forEach(System.out::println);
            
            //Colecciones | Lista
            List<Estudiante> estudiantes = new ArrayList<>();
            estudiantes.add(new Estudiante("Juan", 23));
            estudiantes.add(new Estudiante("Karla", 21));
            estudiantes.add(new Estudiante("Pepe", 18));
            Stream<Estudiante> estudianteStream = estudiantes.stream();
            estudianteStream.forEach(estudiante -> System.out.println(estudiante.getNombre()));
        
            
        //Creacion Streams desde Strings
            Scanner sc = new Scanner(System.in);
            String entrada = sc.nextLine();
            
            //Crea un Stream De Caracteres Unicode de una cadena
            IntStream streamChars = entrada.chars();
            
            //Filtro para quitar espacios y digitos
            streamChars.filter(n -> !Character.isDigit((char)n) && !Character.isWhitespace((char)n))
                    .forEach(n -> System.out.println((char)n));
            
            //Dividir Cadena en un Streams de Streams
            String str = "HTML, CSS, SQL, C, C++, C#, JAVA, PYTHON";
            Pattern.compile(", ")
                    .splitAsStream(str)
                    .forEach(System.out::println);
            
        
            
        //Creacion Streams desde Archivos
        
            //Se abra el archivo y se cierra al no usarse
            Path path1 = Paths.get("C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\04.Lambdas, "
                    + "Streams y Programacion Funcional\\[L04] Streams\\src\\CreacionDeStreams\\Parrafo.txt");
            try(Stream<String> lineas = Files.lines(path1)) {
                lineas.forEach(
                        linea -> {
                            System.out.println("Leyendo Linea...");
                            System.out.println(linea);
                        }
                );
            } catch (IOException e) {
                e.printStackTrace();
            }
    }
}
