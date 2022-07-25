package binaryarray;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class TestBinaryArray {

    public static void main(String[] args) {
        try {
            Scanner in = new Scanner(System.in);
            System.out.print("Introduce una cadena (T,F): " );
            String cadena = in.nextLine();
            BinaryArray obj = new BinaryArray(cadena);
            System.out.println(obj);
            
            
            System.out.println("Indice a Modificar");
            String oneLine = in.nextLine();
            Scanner str = new Scanner(oneLine);
            str.useDelimiter(",");
            boolean variable = str.nextBoolean();
            int index2 = str.nextInt();
            obj.setArray(variable, index2);
            System.out.println(obj);
            
            
            System.out.print("Indice a Acceder: ");
            int index = in.nextInt();
            System.out.println(obj.getArray(index));
            
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        } catch (NoSuchElementException e){
            System.err.println("Error: need two ints");
        }
        

    }

}
