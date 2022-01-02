//Crt + Click || Atajo para ir al origen de variables, argumentos o atributos

package pkg010.alcancevariables;

public class AritmeticaConstructor {
    
    //Atributos de la clase (Solo pueden ser 
    int a;
    int b;
    
    //Constructores
    
        //Constructor Vacio || Reservar espacio de memoria
        public AritmeticaConstructor(){
            System.out.println("Ejecutando Constructor");
        }
        
        //Constructor con Argumentos
        public AritmeticaConstructor(int a, int b){ //Sobrecarga de Constructor || Agregar más de 1 Constructor
            this.a = a;
            this.b = b;
            System.out.println("Ejecutando Constructor Con Argumentos");
        }
    
    //Metodos
    
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
