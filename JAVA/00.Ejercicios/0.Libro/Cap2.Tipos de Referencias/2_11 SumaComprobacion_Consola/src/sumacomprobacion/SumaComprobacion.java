package sumacomprobacion;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class SumaComprobacion {

    public static void main(String[] arg) {
        if(arg.length == 0)
            System.out.println("Archivo no especificado");
        for (String fileName : arg)
            listFile(fileName);
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
