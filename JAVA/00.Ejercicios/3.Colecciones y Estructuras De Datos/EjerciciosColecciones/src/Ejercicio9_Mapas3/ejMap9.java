/*
1. Use Map para completar las siguientes funciones:
    Lea en una secuencia desde la línea de comando, que representa un año, y haga saber qué equipo es el campeón de la Copa del Mundo en ese año. 
    Si la Copa del Mundo no se celebra ese año, salida: No se celebra la Copa del Mundo.
    consejos: consulte el método contieneKey (clave de objeto) de la interfaz del mapa

2. Sobre la base del mapa original de la Copa del Mundo, se agregan las siguientes funciones: 
    leer el nombre de un equipo y generar una lista del año en que el equipo ganó el campeonato. 
    Por ejemplo, si lee "Brasil", debe mostrar 1958 1962 1970 1994 2002 Si lee "Países Bajos", debe mostrar
 */
package Ejercicio9_Mapas3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ejMap9 {

    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1930, "Uruguay");
        map.put(1934, "Italia");
        map.put(1938, "Italia");
        map.put(1950, "Uruguay");
        map.put(1954, "Alemania Occidental");
        map.put(1958, "Brasil");
        map.put(1962, "Brasil");
        map.put(1966, "Inglaterra");
        map.put(1970, "Brasil");
        map.put(1974, "Alemania Occidental");
        map.put(1978, "Argentina");
        map.put(1982, "Italia");
        map.put(1986, "Argentina");
        map.put(1990, "Alemania Occidental");
        map.put(1994, "Brasil");
        map.put(1998, "Francia");
        map.put(2002, "Brasil");
        map.put(2006, "Italia");
        map.put(2010, "España");
        map.put(2014, "Alemania");
        map.put(2018, "Francia");
        System.out.println("Ingrese el año:");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        
        if (map.containsKey(year)) {
            System.out.println(map.get(year));
        } else {
            System.out.println("No se celebra la Copa del Mundo.");
        }
        
        leerPais(map, "Brasil");
    }
    
    public static void leerPais(HashMap<Integer, String> map, String pais){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if(entry.getValue().equals(pais)){
                System.out.println(entry.getKey());
            }
            
            
        }
    }

}
