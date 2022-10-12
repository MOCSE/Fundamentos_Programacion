package Carpeta;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.nio.file.attribute.*;

public class ManejoArchivosConPath {

    public static void main(String[] args) throws IOException {

        //Construccion de rutas
        Path path = Path.of("C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\"
                + "02.Programacion POO\\[043] Manejo Archivos con Path\\src\\Carpeta\\texto1.txt");
        System.out.println(path);
        
        Path path2 = Path.of("C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\"
                + "02.Programacion POO\\[043] Manejo Archivos con Path\\src\\Carpeta\\texto2.txt");
        System.out.println(path);

        //Comprobar si existe un archivo
        boolean exists = Files.exists(path);
        System.out.println("Existe: = " + exists);

        //Obtener la última fecha de modificación de un archivo
        FileTime lastModifiedTime = Files.getLastModifiedTime(path);
        System.out.println("lastModifiedTime = " + lastModifiedTime);

        //Obtener el propietario de un archivo
        UserPrincipal owner = null;
        owner = Files.getOwner(path);
        System.out.println("owner = " + owner);

        //Crear archivos temporales
//        Path tmpDirectory = Files.createTempDirectory("prefix");
//        System.out.println("tmpDirectory = " + tmpDirectory);
        
        
        
        
        
        //Crear archivos y directorios
//        Path newDirectory = Files.createDirectories(path.getParent().resolve("CarpetaNueva"));
//        System.out.println("newDirectory = " + newDirectory);
//
//        Path newFile = Files.createFile(newDirectory.resolve("emptyFile.txt"));
//        System.out.println("newFile = " + newFile);



        //Escribir cadenas en archivos
        Files.writeString(path, "this is my string ää öö üü"); // UTF 8
        
        Files.write(path2, "this is my string ää öö üü".getBytes(StandardCharsets.UTF_8),
        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE);
        
        
        
        //Leer cadenas de archivos
        String s = Files.readString(path); // UTF 8
        System.out.println("s = " + s);

        s = Files.readString(path2, StandardCharsets.ISO_8859_1); // otherwise == utf8
        System.out.println("s = " + s);

        
        
    }

}
