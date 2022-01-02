
package pkg009.constructores;


public class Constructores {

    public static void main(String[] args) {
        
        //Llamando al construcor vacio
        AritmeticaConstructor aritmetica1 = new AritmeticaConstructor();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        //Llamando al construcor con argumentos
        AritmeticaConstructor aritmetica2 = new AritmeticaConstructor(56,89);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
    }
    
}
