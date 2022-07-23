package consolayentradaestandar;

import java.util.Scanner;
import java.io.FileReader;
import java.io.IOException;


public class ConsolayEntradaEstandar {

    public static void main(String[] arg) {
        String archivo = "C:\\Users\\osvid\\Documentos\\test\\prueba.txt";
        
        if(arg.length == 0)
            ManejoArchivos.leerArchivo(archivo);
        else{   
        for (String fileName : arg)
            ManejoArchivos.leerArchivo(fileName);
        }
    }
    
    public static void listFile(String fileName){
        Scanner fileIn = null;
        int suma = 0,sumaTotal = 0;
        
        System.out.println("\n\nARCHIVO: " + fileName);
        try{
            fileIn = new Scanner(new FileReader (fileName));
            while(fileIn.hasNextLine()){
                String linea = fileIn.nextLine();
                System.out.println(linea);
                for (int i = 0; i < linea.length(); i++)
                    suma += (int) linea.charAt(i);
                sumaTotal += suma;
            }
            System.out.println("SumaComprobacion: " + sumaTotal);
        }catch(IOException e){
            System.out.println(e);
        }finally{
            if(fileIn != null)
                fileIn.close();
        }
    }
    }

