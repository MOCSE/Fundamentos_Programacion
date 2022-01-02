
package pkg010.alcancevariables;


public class AlcanceVariables {

    public static void main(String[] args) {
        
        //Variables Locales (No pueden ser utilizadas en ningun otro metodo, ya que se crea y se destruye ne ese metodo) || Var solo se puede usar en variables locales.
        var a = 10;
        var b = 2;
        Metodo2();
            //Memoria Stack
        
        //Variables tipo Object (Se eliminan hasta que se termina la ejecucion del programa), La variable solo apunta al objeto en la memoria
        AritmeticaConstructor aritmetica1 = new AritmeticaConstructor();
        System.out.println("aritmetica1 a: " + aritmetica1.a);
        System.out.println("aritmetica1 b: " + aritmetica1.b);
        
        AritmeticaConstructor aritmetica2 = new AritmeticaConstructor(56,89);
        System.out.println("aritmetica2 a: " + aritmetica2.a);
        System.out.println("aritmetica2 b: " + aritmetica2.b);
            //Memoria Heap
        
            
        //Recolector de Basura 
            //System.gc() || Elimina objetos que ya no esten siendo utilizados cuando sea posible
            System.gc();

    }
    
    public static void Metodo2(){
        // a = 10 || La variable a, esta fuera del alcance deonde fue definida
        System.out.println("Otro metodo");
    }
    
}
