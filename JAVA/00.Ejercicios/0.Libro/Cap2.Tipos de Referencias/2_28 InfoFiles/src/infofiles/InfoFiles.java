package infofiles;

public class InfoFiles {

    public static void main(String[] args) {
        String file = "C:\\Users\\osvid\\Documentos\\test\\prueba.txt";
        ManejoArchivos.leerArchivo(file);
        System.out.println("");
        ManejoArchivos.infoArchivo(file);
    }
    
}
