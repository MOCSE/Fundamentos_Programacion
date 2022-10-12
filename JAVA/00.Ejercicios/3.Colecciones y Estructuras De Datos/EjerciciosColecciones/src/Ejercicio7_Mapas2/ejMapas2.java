/*
    Hay 2 conjuntos: el contenido del primer conjunto es: [Provincia de Heilongjiang, Provincia de Zhejiang, Provincia de Jiangxi, Provincia de Guangdong, Provincia de Fujian], 
    y el segundo conjunto es: [Harbin, Hangzhou, Nanchang, Guangzhou, Fuzhou]. 
    El primer elemento de la matriz se usa como la clave, y el segundo elemento de la matriz se almacena en la colección Map como el valor. 
    Tales como {Provincia de Heilongjiang = Harbin, Provincia de Zhejiang = Hangzhou, ...}.
 */
package Ejercicio7_Mapas2;

import java.util.HashMap;
import java.util.Map;

public class ejMapas2 {
    public static void main(String[] args) {
        String[] char_str1 = {"Provincia de Heilongjiang", "Provincia de Zhejiang", "Provincia de Jiangxi", "Provincia de Guangdong", "Provincia de Fujian"};
        String[] char_str2 = {"Harbin", "Hangzhou", "Nanchang", "Guangzhou", "Fuzhou"};
        
        Map<String,String> map = new HashMap<>();
        for (int i = 0; i < char_str1.length; i++) {
            map.put(char_str1[i], char_str2[i]);
        }
        
        System.out.print("{");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.print(entry.getKey() + " = " + entry.getValue()+ ",\n");
        }
        System.out.println("}");
    }

   

}
