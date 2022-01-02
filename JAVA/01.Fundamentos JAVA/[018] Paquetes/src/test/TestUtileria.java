
package test;

//importar clase desde paquetes y subpaquetes
import mx.com.globalmentoring.Utileria; //import mx.com.globalmentoring.*; || importar todas las clases de un paquete
import static mx.com.globalmentoring.Utileria.imprimir; //import para metodos estaticos de otras clases de un paquete


public class TestUtileria {
    public static void main(String[] args) {
        Utileria.imprimir("Saludos"); // importar todas las clases de un paquete
        imprimir("Adios");            // import para metodos estaticos de otras clases de un paquete
        
        mx.com.globalmentoring.Utileria.imprimir("adios"); //Importacion de Nombre completamente calificado || Archivos de configuración
    }
}
