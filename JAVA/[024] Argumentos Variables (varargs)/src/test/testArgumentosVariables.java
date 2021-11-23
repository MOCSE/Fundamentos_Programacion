
package test;

public class testArgumentosVariables {
    
    public static void main(String[] args) {
        
        imprimirNumeros(3,4,21,23,42);
        imprimirNumeros(1,2);
        variosParametros("Juan", 8,9,10);
    }
    
    // <tipo>... || -No se sabe cuantos elementos se van a pasar al argumento- (Argumento variable) - Internamente Es de tipo arreglo.
    private static void imprimirNumeros(int... numeros){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Elemento:" + numeros[i]);
        }
    }
    
    //El argumento variable debe ir al ultimo de los parametros
    private static void variosParametros (String nombre, int... numeros){
        System.out.println("Nombre = " + nombre);
        imprimirNumeros(numeros);
    }
}
