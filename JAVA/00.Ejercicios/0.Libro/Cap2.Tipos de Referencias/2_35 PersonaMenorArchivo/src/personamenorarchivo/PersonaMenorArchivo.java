package personamenorarchivo;

import java.io.*;

public class PersonaMenorArchivo {
    public static void main(String[] args) {
        String file = "C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\00.Ejercicios\\0.Libro\\2_35 PersonaMenorArchivo\\src\\personamenorarchivo\\jovenes.txt";
        String limitador = " ";
        menorJovenes(file, limitador);
    }
    
    public static void menorJovenes (String nombreArchivo, String limitador){
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            String lectura = entrada.readLine(); //Leer lineas completos del archivo
            int menor = 1000;
            while (lectura != null) {
                String [] arr = lectura.split(limitador);
                if(Integer.parseInt(arr[1]) < menor){
                    menor = Integer.parseInt(arr[1]);
                }
                lectura = entrada.readLine();
            }
            
            entrada = new BufferedReader(new FileReader(archivo));
            lectura = entrada.readLine();
            while (lectura != null) {
                String [] arr = lectura.split(limitador);
                if(Integer.parseInt(arr[1]) == menor){
                    System.out.println(lectura);
                }
                lectura = entrada.readLine();
            }
            

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
