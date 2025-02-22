package notasdecurso;

//java.io || Paquete entrada/salida
import java.io.*;

public class ManejoArchivos {

    //Abrir Archivo
    public static void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo); //Abriendo el archivo
            salida.close(); //Cerrar el flujo || Creacion del archivo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Escribir en el archivo
    public static void escribirArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido); //Escribir en el archivo
            salida.close();
            System.out.println("Se ha escrito en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Anexar en el archivo (Agregar)
    public static void agregarArchivo(String nombreArchivo, String contenido) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, true)); //Para Agregar informacion
            salida.println(contenido);
            salida.close();
            System.out.println("Se ha agregado en el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }

    //Leer informacion del archivo
    public static void leerArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            var lectura = entrada.readLine(); //Leer lineas completos del archivo
            //Leer todas las lineas
            while (lectura != null) {
                System.out.println(lectura);
                lectura = entrada.readLine();
            }

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }

    }
    
    //Informacion del Archivo: No Caracteres, Palabras, y Lineas
    public static void infoArchivo(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            String lectura = entrada.readLine(); //Leer lineas completos del archivo
            int lineas = 0, palabras = 0, caracteres = 0;

            //Leer todas las lineas
            while (lectura != null) {
                //Conteo Caracteres
                caracteres += lectura.length();
                
                //Conteo Palabras
                String [] arr = lectura.split(" ");
                palabras += arr.length;
                
                //Conteo Lineas
                lineas++; 
                
                //Cambio de Linea
                lectura = entrada.readLine();
            }
            
            System.out.println("Caracteres: " + caracteres);
            System.out.println("Palabras: " + palabras);
            System.out.println("Lineas: " + lineas);
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
}
