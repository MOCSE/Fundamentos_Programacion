
package test;

public class Test {
    public static void main(String[] args) {
        
        //Los datos primitivos tienen una clase Wrapper (Envolvente)
        
        //Clases Envolventes de tipos primitivos
        /* Primitivos   - Objetc (Puede almacenar atributos y metodos)
            
            int     - Integer
            long    - Long
            floar   - Float
            double  - Double
            boolean - Boolean
            byte    - Byte
            char    - Character
            short   - Short
        */
        
        //Autoboxing || Envolver un tipo primitivo en un tipo Object
            Integer entero = 10;
            //Literal entera
            System.out.println("entero = " + entero);
            //Literal String
            System.out.println("entero = " + entero.toString());

            //Conversion a tipo flotante
            System.out.println("entero = " + entero.floatValue());
            
        //Unboxing || Extraer el valor primitivo almacenado en un tipo Object para asiganrlo en un tipo primitivo
            int entero2 = entero;
            System.out.println("entero2 = " + entero2);
    }
}
