
package test;

import generico.ClaseGenerica;

public class testGenerics {
    public static void main(String[] args) {
        
        //Indicar solo tipos Object, no se puede usar primitivos
        ClaseGenerica<Integer> objInt = new ClaseGenerica(15);
        objInt.obtenerTipo();
        
        ClaseGenerica<String> objString = new ClaseGenerica("Pedro");
        objString.obtenerTipo();
    }
    
}
