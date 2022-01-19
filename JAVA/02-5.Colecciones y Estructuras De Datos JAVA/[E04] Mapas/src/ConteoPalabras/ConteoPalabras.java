
package ConteoPalabras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class ConteoPalabras {
    public static void main(String[] args) {
        //Crear HashMap para almacenar claves String y valores Integer
        Map<String, Integer> miMap = new HashMap<>();
        
        //Creamos un mapa con base en la entrada del usuario
        crearMap(miMap);
        //Muestra el contenido del mapa
        mostarMap(miMap);
    }
    
    //Crear un mapa a partir de la entrada del usuario
    private static void crearMap(Map<String, Integer> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escriba una cadena: ");
        String entrada = scanner.nextLine();
        
        //divide la entrada en tokens
        String[] tokens = entrada.split(" ");
        
        //procesamiento del texto de entrada
        for (String token : tokens) {
            String palabra = token.toLowerCase(); //Obtiene la palabra en minuscula
            
            //Si el mapa contiene la palabra
            if(map.containsKey(palabra)){
                int cuenta = map.get(palabra);
                map.put(palabra, cuenta+1);
            }
            else{
                map.put(palabra, 1);
            }
        }
    }
    
    //Mostrar el contenido del mapa
    private static void mostarMap(Map<String, Integer> map){
        Set<String> claves = map.keySet(); //Obtener las claves
        
        //Ordena las claves
        TreeSet<String> clavesOrdenadas = new TreeSet<>(claves);
        System.out.printf("%nEl mapa contiene: %nClave\t\tValor\n");
        
        //Genera la salida para cada clave en el mapa
        for (String clave : clavesOrdenadas) {
            System.out.printf("%-10s%10s%n", clave, map.get(clave));
        }
        
        System.out.printf("Tamaño: %d%n¿Vacio?: %b%n",map.size(),map.isEmpty());
    }
}

