
package Operaciones;

public class Aritmetica {
    
    //Atributos
    int a;
    int b;
    
    //Metodos || van con minusculas
    
        //Metodo que no retorna nada y no recive argumentos
        public void sumar(){
            int resultado = a + b;
            System.out.println("Resultado sin retorno = " + resultado);
        }

        //Metodo con retorno (Entero) y no recive argumentos
        public int sumarConRetorno(){
            return a + b;
        }

        //Metodo con retorno (Entero) y recive argumentos
        public int sumarConArgumentos(int a, int b){ //Argumentos
            //this || Hace referencia a un atributo de la clase y no a una variable local |#BUENA PRACTICA#|
            this.a = a; //El atributo a se asigna al atributo this.a
            this.b = b; 
            return this.sumarConRetorno(); //Metodo dentro de otro metodo
        }
    
}
