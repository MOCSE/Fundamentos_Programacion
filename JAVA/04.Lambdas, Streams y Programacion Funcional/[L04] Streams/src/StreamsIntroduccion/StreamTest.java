package StreamsIntroduccion;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13);
        
        //Stream | Usan iteraciones internas
        Stream<Integer> numStream = numeros.stream();
        
        int suma = numStream
                .filter(n -> n % 2 == 1)      // Filtrando numeros si son impares | Op. Intermedia
                .map(n -> n * n)              // Cada elemento va a relizar la operacion n*n | Op. Intermedia
                .reduce(0, Integer::sum);     // Reducir los elementos hasta q solo quede 1 con la operacion definida | Op. Terminal
        
        System.out.println("La suma de los impares es: " + suma);
    }
}
