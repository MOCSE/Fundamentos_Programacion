
package test;

import domain.Persona;

public class TestForEach {
    
    public static void main(String[] args) {

        //For mejorado el cual simplifica el despliegue de arreglos, coleccion de objetos, listas, maps, etc
        //Desventaja no se puede acceder al indice del for
        
        //ForEach Arreglos
        int edades[] = {5,6,8,3,2,3,4,6,456,432};
        for(int edad: edades){
            System.out.println("edad = " + edad);
        }
    
        //ForEach Arreglos de Objetos
        Persona personas[] = {new Persona("Juan",19), new Persona("Karla",39), new Persona("Agusntin",23)};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    
    }
}
