
package pkg3tiposdatosprimitivos;

import java.util.Scanner;


public class TiposDatosPrimitivos {

    public static void main(String[] args) {

        //Tipos primitivos enteros: byte(8b), short (16b), int (32b), long (64b) || Numeros enteros
        System.out.println("###Tipos primitivos enteros###\n");
        
            byte numeroByte = (byte)129; //Convertir valores
            System.out.println("Tipo byte:");
            System.out.println("Valor minimo byte: " + Byte.MIN_VALUE); //Imprimir valores minimos del tipo
            System.out.println("Valor maximo byte: " + Byte.MAX_VALUE); //Imprimir valores maximos del tipo
            System.out.println("numeroByte con Impresion = " + numeroByte);


            short numeroShort = (short)32768; //Convertir valores
            System.out.println("\n\nTipo short:");
            System.out.println("Valor minimo short: " + Short.MIN_VALUE); //Imprimir valores minimos del tipo
            System.out.println("Valor maximo short: " + Short.MAX_VALUE); //Imprimir valores maximos del tipo
            System.out.println("numeroShort con Impresion = " + numeroShort);


            int numeroInt = (int)2147483648L; //Convertir valores
            System.out.println("\n\nTipo Integer (int):");
            System.out.println("Valor minimo int: " + Integer.MIN_VALUE); //Imprimir valores minimos del tipo
            System.out.println("Valor maximo int: " + Integer.MAX_VALUE); //Imprimir valores maximos del tipo
            System.out.println("numeroInt con Impresion = " + numeroInt);


            long numeroLong = (long)9223372036854775808D; //Convertir valores
            System.out.println("\n\nTipo long:");
            System.out.println("Valor minimo long: " + Long.MIN_VALUE); //Imprimir valores minimos del tipo
            System.out.println("Valor maximo long: " + Long.MAX_VALUE); //Imprimir valores maximos del tipo
            System.out.println("numeroLong con Impresion = " + numeroLong);

        
        
        
        //Tipos primitivos flotante: float (32bits), double(64bits) || Numeros Racionales
        System.out.println("\n- - - - - - - - - - -\n\n###Tipos primitivos flotante###\n");
        
            float numeroFloat = (float)3.4028235E39D; //Convertir valores
            System.out.println("Tipo float:");
            System.out.println("Valor minimo float: " + Float.MIN_VALUE); //Imprimir valores minimos del tipo
            System.out.println("Valor maximo float: " + Float.MAX_VALUE); //Imprimir valores maximos del tipo
            System.out.println("numeroFloat con Impresion = " + numeroFloat);


            double numeroDouble = 1.7976931348623157E308;
            System.out.println("\n\nTipo double:");
            System.out.println("Valor minimo double: " + Double.MIN_VALUE); //Imprimir valores minimos del tipo
            System.out.println("Valor maximo double: " + Double.MAX_VALUE); //Imprimir valores maximos del tipo
        
        
            
            
        //Tipo primitivo char: char(16bits) || Caracteres
        System.out.println("\n- - - - - - - - - - -\n\n###Tipo primitivo flotante###\n");
        
            char miCaracter = 'a';
            System.out.println("Tipo char:");
            System.out.println("miCaracter = " + miCaracter);
            
            char varChar = '\u0025'; //Desplegar caracter con Unicode
            System.out.println("varChar = " + varChar);
            
            char varCharDecimal = 36; //Desplegar caracter con Decimal
            System.out.println("varCharDecimal = " + varCharDecimal);
        
            char varCharSimbolo = '!'; //Desplegar caracter con Simbolo
            System.out.println("varCharSimbolo = " + varCharSimbolo);
            
            int variableEnteraSimbolo = 'a'; //desplegar codigo deciaml de un caracter
            System.out.println("variableEnteraSimbolo = " + variableEnteraSimbolo);
        
        
            
            
        //Tipo primitivo boolean: boolean || Boleanos (True or False) [tipo de dato bandera]
        System.out.println("\n- - - - - - - - - - -\n\n###Tipo primitivo boolean###\n");    
            boolean varBoolean = false;
            System.out.println("varBoolean = " + varBoolean);
            
            if(varBoolean) //Equivale a -> if(varBoolean) == true 
                System.out.println("La bandera es verdadera");
            else
                System.out.println("La bandera es falsa");
                   
        
            
             
        //Palabra reservada VAR | Inferencia con VAR - Por defecto se define como Int & double (sea el caso)
        System.out.println("\n- - - - - - - - - - -\n\n###Inferencia con VAR###\n");
        
            var numeroEntero2 = 10; //Inferencia en Int
            System.out.println("numeroEnteroVAR = " + numeroEntero2);
            
            var numeroDouble2 = 10.0; //Inferencia en Double
            System.out.println("numeroEnteroVAR = " + numeroDouble2);
            
            var numeroFlotante2 = 10.0F; //Inferencia en Float
            System.out.println("numeroEnteroVAR = " + numeroFlotante2);
            
            var miCaracter2 = 'a'; //Inferencia en Char
            System.out.println("CaracterVAR = " + miCaracter2);
            
            var edad = 30;
            var esAdulto = edad >= 18; //Inferencia en Boolean
            System.out.println("BooleanVAR = " + esAdulto);
                   
        
      
            
        //Conversion de tipos
        System.out.println("\n- - - - - - - - - - -\n\n###Conversion de tipos###\n");
            
            //Convertir tipo String a tipo int || Integer.parseInt()
            System.out.println("Valor String = '20'\n\nConvertir tipo String a tipo int");
            
            var edad2 = "20";
            System.out.println("Sin convertir = " + (edad2 + 1));
            
            var edad3 = Integer.parseInt(edad2);
            System.out.println("Convertido = " + (edad3 + 1));
            
            //Convertir tipo String a tipo double || Double.parseDouble()
            System.out.println("\nConvertir tipo String a tipo double");

            var ValorPI = Double.parseDouble("3.1416");
            System.out.println("ValorPI = " + ValorPI);
            
                /* Pedir un valor
                System.out.println("\nPedir un valor");
                var consola = new Scanner(System.in);

                System.out.print("Proporciona tu edad: ");
                edad3 = Integer.parseInt(consola.nextLine());
                System.out.println("edad = " + edad3); */
            
            //Convertir tipo int [o cualquier otro tipo] a tipo String || String.valueOf()
            System.out.println("\nConvertir tipo int a tipo String");
            var edadTexto = String.valueOf(10);
            System.out.println("edadTexto = " + edadTexto);
            
            //Convertir tipo String a Caracter || <String>.charAt(<indice>)
            var caracter = "Hola".charAt(0);
            System.out.println("caracter = " + caracter);
                
                /* Pedir un valor
                System.out.println("\nPedir un valor");
                var consola = new Scanner(System.in);

                System.out.print("Proporciona un caracter: ");
                caracter = consola.nextLine().charAt(0);
                System.out.println("caracter = " + caracter); */
    }   
}
