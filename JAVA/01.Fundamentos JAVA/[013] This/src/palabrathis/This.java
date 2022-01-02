package palabrathis;

public class This {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Oscar","Romero");
        System.out.println("persona:                            " + persona);
        System.out.println("Persona nombre: " + persona.nombre);
        System.out.println("Persona apellido: " + persona.apellido);
    }
}

/* this || La palabra this es un operador y básicamente nos permite acceder al objeto que se está ejecutando en cualquier método, 
           Es una referencia implicita al objeto que se está ejecutando */

       // ** Es util para la ambigüedad entre variables de clase y las locales

class Persona{
    
    //Atributos
    String nombre;
    String apellido;
    
    //Constructor
    Persona(String nombre, String apellido){
        // super(); Llamada al constructor de la clase Padre (object)
        
        //ambigüedad entre variables de clase y las locales
        this.nombre = nombre;
        this.apellido = apellido;
        System.out.println("Objeto persona usando this:         " + this);
        new Imprimir().imprimir(this); //Equivalente a Imprimir imprimir = new Imprimir();
    }
}


class Imprimir{
    public void imprimir(Persona persona){
        System.out.println("Persona desde imprimir:             " + persona);
        System.out.println("Impresion del objeto actual(this):  " + this);
    }
}