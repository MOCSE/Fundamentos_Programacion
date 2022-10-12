/*
    7.- Defina una colección de Lista cuyo tipo genérico sea Cadena y cuente el número de ocurrencias de cada carácter (nota, no una cadena) en la colección. 
    Por ejemplo: hay dos elementos "abc" y "bcd" en el conjunto, el resultado final del programa es: "a = 1, b = 2, c = 2, d = 1".
 */
package Ejercicio8_Mapas3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ejMapas3 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("abcd");
        lista.add("adebc");
        lista.add("sffa");
        Map<Character,Integer> map = new HashMap<>();
        
        for (String cadena : lista) {
            for (int i = 0; i < cadena.length(); i++) {
                if(map.containsKey(cadena.charAt(i))){
                    int cuenta = map.get(cadena.charAt(i));
                    map.put(cadena.charAt(i), cuenta+1);
                }
                else{
                    map.put(cadena.charAt(i), 1);
                }
            }
        }

        System.out.println("Lista: " + lista + "\nMapa: " + map);
    }

}
