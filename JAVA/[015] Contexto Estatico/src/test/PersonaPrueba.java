package test;

import domain.Persona;


public class PersonaPrueba {
    
    private int contador;
    
    public static void main(String[] args) {
        
        Persona persona1 = new Persona("Pedro");
        Persona persona2 = new Persona("Karla");
        
        imprimir(persona1);
        imprimir(persona2);
        
        // No se puede acceder por el contexto estatico
        // this.contador = 10;
        // contador = 10;
    }
    
    //si se va a usar otro metodo dentro de otro metodo estatico debe ser de igual forma estatico
    public static void imprimir(Persona persona){
        System.out.println("persona = " + persona);
    }
    
    public int getContador(){
        imprimir(new Persona("Carlos"));
        return this.contador;
    }
}
