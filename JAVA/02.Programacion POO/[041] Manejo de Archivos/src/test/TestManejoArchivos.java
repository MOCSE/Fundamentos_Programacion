package test;

import ManejoArchivos.ManejoArchivos;

public class TestManejoArchivos {

    public static void main(String[] args) {
        
        //Crear archivo - Indicar ruta de creacion del archivo
        var nombreArchivo = "C:\\Users\\osvid\\Documentos\\test\\prueba.txt";
        ManejoArchivos.crearArchivo(nombreArchivo);
        
        //Escribir en el metodo (Sobreescribiendo informacion)
        ManejoArchivos.escribirArchivo(nombreArchivo, "Hola Mundo desde el Manejo de Archivos JEJE");
        ManejoArchivos.escribirArchivo(nombreArchivo, "Hola Mundo desde el Manejo de Archivos JEJE2");
        
        //Agregar informacion
        ManejoArchivos.agregarArchivo(nombreArchivo, "Agregando cochinadas");
        
        //Leer el archivo
        ManejoArchivos.leerArchivo(nombreArchivo);
    }
    
}
