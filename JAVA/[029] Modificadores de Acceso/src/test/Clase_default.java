
// default o package || ausencia de modificadores de acceso & solo puede ser utilizada dentro de un mismo paquete

package test;

//No puede ser utilizada fuera de este paquete
class Clase_default {
    
    //Atributo Default
    String atributoDefault = "Valor Atributo Default";
    
    //Constructor Default
    Clase_default(){
        System.out.println("Constructor protected");
    }
    
    //Metodo Default
    void metodoDefault(){
        System.out.println("Metodo Default");
    }
    
}
