
package domain;

public class Persona {
    
    //Atributos
    private final int idPersona;
    private static int contadorPersonas;
    
    //Bloque de inicializacion estatico || Se ejecuta una vez que se carga en memoria y antes del constructor
    static {
        System.out.println("Ejecución bloque estatico");
        ++Persona.contadorPersonas;
    }
    
    //Bloque de inicializacion no estatico || Se ejecuta cada vez que se crea un objeto y antes del constructor
    {
        System.out.println("Ejecución bloque NO estatico");
        this.idPersona = Persona.contadorPersonas++;
    }
    
    //Constructor
    public Persona() {
        System.out.println("Ejecucion del Contructor");
    }
    
    //Metodos
    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
