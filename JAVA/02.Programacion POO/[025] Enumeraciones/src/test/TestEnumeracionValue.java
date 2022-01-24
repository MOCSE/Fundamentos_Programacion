
package test;

import enumeracion.Continentes;


public class TestEnumeracionValue {
    public static void main(String[] args) {
        
        imprimirContinentes();
        
    }
    
    
    /* Uso de values || El método values se agrega por default cada que creamos una enumeración. El
                        objetivo de este método es que nos regrese una lista de cada una de las constantes
                        definidas en una enumeración. */
    
    public static void imprimirContinentes(){
        for(Continentes c : Continentes.values()){
            System.out.println("Continente: " + c + " contiene " + c.getPaises() + " paises.");
        }
    }
}
