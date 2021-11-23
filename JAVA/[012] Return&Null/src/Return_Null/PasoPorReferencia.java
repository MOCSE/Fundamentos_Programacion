package Return_Null;

import clases.Persona; 

public class PasoPorReferencia {
    public static void main(String[] args) {
        
        Persona persona1 = null;
        // persona1.nombre = "Juan";
        // System.out.println("Persona1 nombre = " + persona1.nombre);
        persona1 = cambiaValor(persona1);
        // System.out.println("Persona1 cambio nombre = " + persona1.nombre);
    }
        
    //return || Retorna un valor a otro metodo. En este caso regresa la referencia - Si se requiere usar mas return en un mismo metodo se usa varios returns
    //null   || Indica que una variable que referencia a un objeto se encuentra “sin objeto”, es decir, la variable ha sido declarada pero no apunta a ningún objeto.
    
    public static Persona cambiaValor(Persona persona){ 
        if(persona == null){
            System.out.println("Valor de persona invalido : null");
            return null;
        }
        persona.nombre = "Karla";
        return persona;
    }
}
