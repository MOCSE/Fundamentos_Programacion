
package pkg4operadores;


public class Operadores {

    public static void main(String[] args) {
        
        //Operadores Aritmeticos || +, -, *, /, %
            System.out.println("##Operadores Aritmeticos##");
            int a=3, b=2; 
            
            //Suma
            var resultado = a + b;
            System.out.println("Resultado Suma = " + resultado);

            //Resta
            resultado = a - b;
            System.out.println("Resultado Resta = " + resultado);

            //Multiplicacion
            resultado = a * b;
            System.out.println("Resultado Multiplicacion = " + resultado);

            //Division
            var resultado2 = (float)a / b;
            System.out.println("Resultado Division = " + resultado2);

            //Modulo
            resultado = a % b;
            System.out.println("Resultado Modulo = " + resultado);
            
            
            
        //Operadores de Asignacion || += , +=, *=, /=, %=
            System.out.println("\n\n##Operadores de Asignacion##");
            a=3; b=2;
            
            //Asignacion
            int c = a + 5 - b;
            System.out.println("Asigncacion (c) = " + c);
            
            //Asignacion de composicion || += , +=, *=, /=, %=
            a += 1; // a = a + 1
            a -= 2; // a = a - 2
            System.out.println("Asignacion de composicion (a) = " + a);
            
            
            
        //Operadores Unarios || -, !, ++, --
            System.out.println("\n\n##Operadores Unarios##");
            
            //Cambio de signo || -
            a=3; b= -a;
            System.out.println("Cambio de signo a = " + a);
            System.out.println("Cambio de signo b = " + b);
            
            //Negacion || !
            var c2 = true;
            var d = !c2;
            System.out.println("Negacion a = " + c2);
            System.out.println("Negacion b = " + d);
            
            //Incremento || ++, --
                //Pre-incremento (simbolo antes de la variable)
                var e = 3;
                var f = ++e; //primero se incrementa la variable y despues se usa su valor
                System.out.println("Pre-incremento a = " + e);
                System.out.println("Pre-incremento b = " + f);
                
                //Post-incremento (simbolo despues de la variable)
                var g = 3;
                var h = g++; //primero se usa su valor y despues se incrementa la variable
                System.out.println("Post-incremento a = " + g);
                System.out.println("Post-incremento b = " + h);            
            
            
                
        //Operadores de Igualdad || ==, !=, equals()
            System.out.println("\n\n##Operadores de Igualdad##");
            a=3; b=2;
            
            //Igualdad || ==
            var c3 = (a == b);
            System.out.println("Igualdad (a == b) = " + c3);
            
            //Diferente a || !=
            c3 = (a != b);
            System.out.println("Igualdad (a != b) = " + c3);
            
                //Comparacion de referencia de la memoria del objeto || ==
                var cadena = "Hola";
                var cadena2 = "Adios";
                var e2 = cadena == cadena2; 
                System.out.println("Igualdad de Cadenas (==) = " + e2);
                
                //Comparar contenido de objetos || <objeto1>.equals(<objeto2>)
                var f2 = cadena.equals(cadena2);
                System.out.println("Igualdad de Cadenas (equals()) = " + f2);            
            
                
                
        //Operadores Relacionales || >, >=, <, <=
            System.out.println("\n\n##Operadores Relacionales##");
            a=3; b=2;
            
            //Mayor que & Mayor e igual que || >, >=
            var g2 = a > b;
            System.out.println("Mayor que (a>b) = " + g2);
            
            //Menor que & Menor e igual que || <, <=
            g2 = a < b;
            System.out.println("Menor que (a<b) = " + g2);
                           
                           
            
        //Operadores Condicionales || &&, ||
            System.out.println("\n\n##Operadores Condicionales##");
            a = 12;
            var valorMinimo = 0;
            var valorMaximo = 10;
            
            //And (cuando todas las condiciones se cumplen)
            var res = a >= 0 && a <= 10;
            System.out.println("And = " + res);
            
            //Or (cuando una condicion se cumple)
            res = a >= 0 || a<= 10;
            System.out.println("Or  = " + res);
                                       
                           
            
        //Operadores Operador Ternario || ? - Condicion ? Si es verdadero : Si es falso;
            System.out.println("\n\n##Operador Ternario##");
            
            var res2 = (3 > 2) ? "verdadero" : "falso" ;
            System.out.println("Operador Ternario = " + res2);
    }
} 
