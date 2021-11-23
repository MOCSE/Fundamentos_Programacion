
package test;

import paquete1.*;
import paquete2.*;

public class ModificadoresDeAcceso {
    
    /* Donde se puede aplicar:
    
        Modificador     Clase       Variable        Metedo      Constructor
        
        public           Si            Si             Si           Si
        protected        No            Si             Si           Si
        default *        Si            Si             Si           Si
        private          No            Si             Si           Si
    
        **Ordenados del menos restrictivo al más restrictivo**
    */
    
    public static void main(String[] args) {
        
        //Clase publico
        Clase_public clase1 = new Clase_public();
        System.out.println("clase1 = " + clase1.atributoPublico);
        clase1.metodoPublico();
        
        //Clase protected
//        Clase_protected clase2 = new Clase_protected();
//        System.out.println("clase2 = " + clase2.atributoProtected);
//        clase2.metodoProtected();
        
        ClaseHija claseHija = new ClaseHija();
        System.out.println("claseHija = " + claseHija);
        
        //Clase Default
        Clase_default claseDefault = new Clase_default();
        
        //Clase Private
//        Clase_Private clasePrivate = new Clase_Private(); || No es posible
    }
}
