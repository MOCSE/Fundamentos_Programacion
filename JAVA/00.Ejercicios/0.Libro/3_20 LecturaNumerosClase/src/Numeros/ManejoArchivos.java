package Numeros;

//java.io || Paquete entrada/salida
import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase para el manejo de Archivos de Texto
 * @author Romero Hernádez Oscar David
 */

public class ManejoArchivos{
    
    /**
     * Crear Archivo
     * @param nombreArchivo 
     */
    public void crearArchivo(String nombreArchivo) {
        File archivo = new File(nombreArchivo);

        try {
            PrintWriter salida = new PrintWriter(archivo); //Abriendo el archivo
            salida.close(); //Cerrar el flujo || Creacion del archivo
            System.out.println("Se ha creado el archivo");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }

    /**
     * Escribir en el archivo sobrescribiendo todo
     * @param nombreArchivo
     * @param contenido 
     */
    public void escribirArchivo(String nombreArchivo, String contenido) {
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

    /**
     * Escribir en el archivo sin sobrescribir
     * @param nombreArchivo
     * @param contenido 
     */
    public void agregarArchivo(String nombreArchivo, String contenido) {
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

    /**
     * Leer Archivo completo
     * @param nombreArchivo 
     */
    public void leerArchivo(String nombreArchivo) {
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
    
     /**
     * Guardar Archivo completo en ArrayList
     * @param nombreArchivo 
     * @return  
     */
    public List<String> guardarArchivoString(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        List<String> listaNumeros = new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            var lectura = entrada.readLine(); //Leer lineas completos del archivo
            //Leer todas las lineas
            while (lectura != null) {
                listaNumeros.add(lectura);
                lectura = entrada.readLine();
            }
            System.out.println("Se ha Guardado en ArrayList Correctamente");
            return listaNumeros;

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
    
     /**
     * Guardar Archivo completo en ArrayList
     * @param nombreArchivo 
     * @return  
     */
    public List<Double> guardarArchivoDouble(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        List<Double> listaNumeros = new ArrayList<>();

        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            var lectura = entrada.readLine(); //Leer lineas completos del archivo
            //Leer todas las lineas
            while (lectura != null) {
                listaNumeros.add(Double.parseDouble(lectura));
                lectura = entrada.readLine();
            }
            System.out.println("Se ha Guardado en ArrayList Correctamente");
            return listaNumeros;

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return null;
    }
    
    /**
     * Retorna la cantidad de lineas
     * @param nombreArchivo
     * @return 
     */
    public int lineas(String nombreArchivo){
        File archivo = new File(nombreArchivo);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            String lectura = entrada.readLine(); //Leer lineas completos del archivo
            int lineas = 0;

            while (lectura != null) {
                lineas++; 
                lectura = entrada.readLine();
            }
            return lineas;
            
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        return 0;
    }
    
    /**
     * Info Archivo: Caracteres, Lineas, Palabras
     * @param nombreArchivo 
     */
    public void infoArchivo(String nombreArchivo){
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
