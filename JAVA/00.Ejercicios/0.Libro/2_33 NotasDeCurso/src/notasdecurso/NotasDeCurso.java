package notasdecurso;

import java.io.*;

public class NotasDeCurso {

    public static void main(String[] args) {
        String file = "C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\00.Ejercicios\\0.Libro\\2_33 NotasDeCurso\\src\\notasdecurso\\notas.txt";
        String limitador = ":";
        try {
            leerArchivo(file, limitador, 20, 25, 55);
        } catch (ArithmeticException e) {
            System.out.println("Ponderaciones no Validas");
            System.err.println(e);
        }
    }
    
    //Leer informacion del archivo con limitador
    public static void leerArchivo(String nombreArchivo, String limitador, int p1, int p2, int p3) throws ArithmeticException{
        if((p1+p2+p3) != 100){
            throw new ArithmeticException("ERROR; Ponderaciones no iguales a 100");
        }
        else{
        
        File archivo = new File(nombreArchivo);
        String fileNew = "C:\\Users\\osvid\\Documentos\\GitHub\\OSC\\JAVA\\00.Ejercicios\\0.Libro\\2_33 NotasDeCurso\\src\\notasdecurso\\notasFinal.txt";
        ManejoArchivos.crearArchivo(fileNew);
        
        try {
            BufferedReader entrada = new BufferedReader(new FileReader(archivo)); //Leer lineas completos del archivo
            String lectura = entrada.readLine(); //Leer lineas completos del archivo
            String nombre = "", apellido = "";
            double cal1 = 0,cal2 = 0,cal3 = 0, aux = 0;
            char letra = ' ';
            
            while (lectura != null) {
                String [] arr = lectura.split(limitador);
                for (int i = 0; i < 5; i++) {
                    switch (i) {
                        case 0 -> nombre = arr[0];
                        case 1 -> apellido = arr[1];
                        case 2 -> cal1 = (p1 * Double.parseDouble(arr[2])) / 10;
                        case 3 -> cal2 = (p2 * Double.parseDouble(arr[3])) / 10;
                        case 4 -> cal3 = (p3 * Double.parseDouble(arr[4])) / 10;
                    }
                }
                double calSuma = (cal1+cal2+cal3);
                if(calSuma >= 90)
                    letra = 'A';
                else if(calSuma >= 80 && calSuma < 90)
                    letra = 'B';
                else if(calSuma >= 70 && calSuma < 80)
                    letra = 'C';
                else if(calSuma >= 60 && calSuma < 70)
                    letra = 'D';
                else
                    letra = 'F';
                
                //Escribir en txt
                String contenido = nombre + " " + apellido + " " + cal1 + " " + cal2 + " " + cal3 + " " + letra;
                
                ManejoArchivos.agregarArchivo(fileNew, contenido);

                System.out.println(nombre + " " + apellido + " |  " +  letra + " - " + calSuma);
                lectura = entrada.readLine();
            }
            

        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
        
        }

    }
    
   
}
