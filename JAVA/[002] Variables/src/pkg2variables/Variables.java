
package pkg2variables;

import java.util.Scanner; //Clase de Scanner


public class Variables {

    public static void main(String[] args) { // F6 || Compilar
        
        //Definir la variable primitiva
        int miVariableEntera = 10; //Asignacion de Numeros enteros
        System.out.println(miVariableEntera);
        
            //Modificar Valor de la variable
            miVariableEntera = 5;
            System.out.println(miVariableEntera); //sout + TAB || Atajo System.out.println

        //String no es tipo primitivo, si no un tipo objeto.
        String miVariableCadena = "Saludos"; //Asgnacion de cadenas de texto
        System.out.println(miVariableCadena); // Crtl + Space || (Llamar a las variables definidas)
        
            //Modificar Valor de la variable String
            miVariableCadena = "Adios";
            System.out.println(miVariableCadena);

        // var - Inferencia de tipos de JAVA || JAVA detecta solita el tipo de variable que se usa.
        var entero = 100;
        var string = "Texto";
        var decimal = 20.6;
        System.out.println(entero+" "+string+" "+decimal);
        System.out.println("decimal = " + decimal); //soutv + TAB || Atajo Para manda a imprimir la ultima variable definida
        
        
        //Valores Permitidos en nombres de variables
        var miVariable  = 1;
        var _miVariable = 2;
        var $miVariable = 3;
        var áVariable   = 10; //Es posible pero no se recomienda utilizar.
        /* var #miVariable = 2;  NO SE PERMITE UTILIZAR CARACTERES ESPECIALES. */
        
        
        //Concatenación de cadenas
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = usuario + " " + titulo;
        System.out.println("\nunion = " + union); //Format (click derecho) || Reajusta las tabulaciones (Dar formato)
        
        //Concatenacion de numeros
        var i = 3;
        var j = 4;
        System.out.println(i + j); //*Se realiza la suma de numeros*
        System.out.println(i + j + usuario); //*Se realiza la suma de numeros + La concatenacion*
        System.out.println(usuario + i + j); //Contexto Cadena || *Concatenacion + Concatenacion de numeros* (si encuentra primero una cadena, todo lo demas se concanenara)
        System.out.println(usuario + (i + j)); //Modificando la prioridad de la concatenacion con parentesis
        
        
        //Caracteres Especiales en JAVA
        var nombre = "Karla";
        System.out.println("\nNueva Linea: \n" + nombre);           //Salto de linea
        System.out.println("Tabulador: \t" + nombre);               //Tabulacion
        System.out.println("Retroceso: \b\b" + nombre);             //Regresa una posicion en la salida
        System.out.println("Comilla Simple: \'" + nombre + "\'");   //Comilla Simple
        System.out.println("Comilla Doble: \"" + nombre + "\"");    //Comilla Simple
        
        
        //Clase Scanner JAVA
        Scanner consola = new Scanner(System.in); //Se crea un Objeto para Leer datos en consola
        
        System.out.print("\nEscribe tu nombre: ");
        var usuario2 = consola.nextLine(); //Se asigna el dato introducido despues de dar ENTER
        System.out.println("\nnombre = " + usuario2);
        System.out.print("Escribe tu apellido: ");
        var apellido = consola.nextLine(); 
        System.out.println("\nnombre = " + usuario2 + " " + apellido);
    }
    
}
